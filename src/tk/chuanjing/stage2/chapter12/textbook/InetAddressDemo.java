package tk.chuanjing.stage2.chapter12.textbook;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author ChuanJing
 * @date 2017年9月18日 下午3:21:53
 * @version 1.0

	InetAddress:此类表示互联网协议 (IP) 地址
 */
public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException   {
		//static InetAddress getByName(String host) 
//		InetAddress address = InetAddress.getByName("DESKTOP-274799T");
//		System.out.println(address);//DESKTOP-274799T/169.254.174.86
		
		InetAddress address = InetAddress.getByName("169.254.174.86");//ip地址是唯一的
		System.out.println(address);// /169.254.174.86
		
		String hostAddress = address.getHostAddress();//169.254.174.86 返回IP地址
		String hostName = address.getHostName();//DESKTOP-274799T	返回主机名
		System.out.println(hostAddress);
		System.out.println(hostName);
	}
}