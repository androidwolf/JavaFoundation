package TestBigLittleEndian;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/**
 * @author yexx
 * ByteBuffer���ֽڴ洢����
 */
public class Endians {
	public static void main(String[] args) {
		// ����12���ֽڵ��ֽڻ�����
		ByteBuffer bb = ByteBuffer.wrap(new byte[12]);
		// �����ַ���
		bb.asCharBuffer().put("abcdef");
		System.out.println(Arrays.toString(bb.array()));

		// ��ת������
		bb.rewind();
		// �����ֽڴ洢����
		bb.order(ByteOrder.BIG_ENDIAN);
		bb.asCharBuffer().put("abcdef");
		System.out.println(Arrays.toString(bb.array()));

		// ��ת������
		bb.rewind();
		// �����ֽڴ洢����
		bb.order(ByteOrder.LITTLE_ENDIAN);
		bb.asCharBuffer().put("abcdef");
		System.out.println(Arrays.toString(bb.array()));
	}
}
