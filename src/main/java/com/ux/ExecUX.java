package com.ux;

import java.io.InputStream;
import java.util.Properties;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

public class ExecUX {

	public static void main(String[] args) {

		String host = "192.168.1.4";
		String user = "divesd";
		String password = "divesd";
		String command1 = "ls -ltr";
		Channel channel = null;
		Session session = null;
		Properties props = null;
		InputStream instr = null;
		//String fileName = "config.properties";

		try {
			props = new Properties();
			instr = ExecUX.class.getClassLoader().getResourceAsStream(UxConstants.FILENAME);
			props.load(instr);

			java.util.Properties config = new java.util.Properties();
			config.put("StrictHostKeyChecking", "no");
			JSch jsch = new JSch();
			session = jsch.getSession(user, host, 22);
			session.setPassword(password);
			session.setConfig(config);
			session.connect();
			System.out.println("Connected");

			channel = session.openChannel("exec");
			((ChannelExec) channel).setCommand(command1);
			channel.setInputStream(null);
			((ChannelExec) channel).setErrStream(System.err);

			InputStream in = channel.getInputStream();
			channel.connect();
			byte[] tmp = new byte[1024];
			while (true) {
				while (in.available() > 0) {
					int i = in.read(tmp, 0, 1024);
					if (i < 0)
						break;
					System.out.print(new String(tmp, 0, i));
				}
				if (channel.isClosed()) {
					System.out.println("exit-status: "
							+ channel.getExitStatus());
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			channel.disconnect();
			session.disconnect();
			System.out.println("DONE");
		}
	}
}
