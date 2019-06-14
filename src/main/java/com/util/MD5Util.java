package com.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util {
	public static String getMD5(String str) {
		StringBuffer sb = new StringBuffer();
		try {
			// 指定加密方式
			MessageDigest md5 = MessageDigest.getInstance("md5");
			// 准备要加密的数据
			byte[] b = str.getBytes();
			// 加密
			byte[] digest = md5.digest(b);
			// 十六进制的字符数组
			char[] chars = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E','F' };
			// 处理成十六进制的字符串
			for (byte bb : digest){
				   sb.append(chars[(bb >> 4) & 15]);
	               sb.append(chars[bb & 15]);
			}
			return sb.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
	public static String getMD53(String str){
		try {
			MessageDigest md5 = MessageDigest.getInstance("md5");
			md5.update(str.getBytes());
			 // digest()最后确定返回md5 hash值，返回值为8为字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
			 // BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
			return new BigInteger(1,md5.digest()).toString(16);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return str;
		
	}
	public static String getMD52(String str){
		try {
			MessageDigest md5 = MessageDigest.getInstance("md5");
			md5.update(str.getBytes());
			byte[] b = md5.digest();
			int i;
			StringBuilder sb = new StringBuilder();
			for(int offset=0;offset<b.length;offset++){
				i=b[offset];
				if(i<0){
					i+=256;
				}
				if(i<16){
					sb.append("0");
					sb.append(Integer.toHexString(i));
				}
			}
			return sb.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return null;
		}
	}
	public static void main(String[] args) {
		System.out.println(MD5Util.getMD5("777111ss"));
		System.out.println(MD5Util.getMD52("777111ss"));
		System.out.println(MD5Util.getMD53("777111ss"));


	}
}
