package tk.chuanjing.stage2.chapter12.textbook;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author ChuanJing
 * @date 2017年9月18日 下午4:13:20
 * @version 1.0

	使用UDP协议接收数据
			创建接收端Socket对象
			接收数据
			解析数据
			输出数据
			释放资源
 */
public class UDPReceiveDemo {
	public static void main(String[] args) throws IOException {
		//创建接收端Socket对象
		DatagramSocket ds = new DatagramSocket(8888);
		
		//接收数据
		//DatagramPacket(byte[] buf, int length) 
		byte[] bys = new byte[1024];
		DatagramPacket dp = new DatagramPacket(bys,bys.length);
		
		ds.receive(dp);//阻塞
		
		//解析数据
		//InetAddress getAddress() : 获取发送端的IP对象
		InetAddress address = dp.getAddress();
		
		//byte[] getData()  ：获取接收到的数据，也可以直接使用创建包对象时的数组
		byte[] data = dp.getData();
		
		//int getLength()  ：获取具体收到数据的长度
		int length = dp.getLength();
		
		//输出数据
		System.out.println("sender ---> " + address.getHostAddress());
		//System.out.println(new String(data,0,length));
		System.out.println(new String(bys,0,length));
		
		//释放资源
		ds.close();
	}
}