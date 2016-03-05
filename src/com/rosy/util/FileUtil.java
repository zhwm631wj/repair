package com.rosy.util;

/**
 * Copyright: Copyright (c) 2002-2004
 * Company: JavaResearch(http://www.javaresearch.org)
 * ����������:2003��5��18��
 * @author Cherami
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * �����з�װһЩ���õ��ļ������� ���з������Ǿ�̬����������Ҫ���ɴ����ʵ���� Ϊ�������ɴ����ʵ�������췽��������Ϊprivate���͵ġ�
 * 
 * @since 0.1
 */

public class FileUtil {
	/**
	 * ˽�й��췽������ֹ���ʵ��������Ϊ�����಻��Ҫʵ������
	 */
	private FileUtil() {

	}

	/**
	 * �޸��ļ���������ʱ�䡣 ����ļ��������򴴽����ļ���
	 * <b>Ŀǰ�����������Ϊ��ʽ�����ȶ�����Ҫ�Ƿ�����Щ��Ϣ�������Щ��Ϣ����Ƿ������ڿ����С�</b>
	 * 
	 * @param file
	 *            ��Ҫ�޸�������ʱ����ļ���
	 * @since 0.1
	 */
	public static void touch(File file) {
		long currentTime = System.currentTimeMillis();
		if (!file.exists()) {
			System.err.println("file not found:" + file.getName());
			System.err.println("Create a new file:" + file.getName());
			try {
				if (file.createNewFile()) {
					System.out.println("Succeeded!");
				} else {
					System.err.println("Create file failed!");
				}
			} catch (IOException e) {
				System.err.println("Create file failed!");
				e.printStackTrace();
			}
		}
		boolean result = file.setLastModified(currentTime);
		if (!result) {
			System.err.println("touch failed: " + file.getName());
		}
	}

	/**
	 * �޸��ļ���������ʱ�䡣 ����ļ��������򴴽����ļ���
	 * <b>Ŀǰ�����������Ϊ��ʽ�����ȶ�����Ҫ�Ƿ�����Щ��Ϣ�������Щ��Ϣ����Ƿ������ڿ����С�</b>
	 * 
	 * @param fileName
	 *            ��Ҫ�޸�������ʱ����ļ����ļ�����
	 * @since 0.1
	 */
	public static void touch(String fileName) {
		File file = new File(fileName);
		touch(file);
	}

	/**
	 * �޸��ļ���������ʱ�䡣 ����ļ��������򴴽����ļ���
	 * <b>Ŀǰ�����������Ϊ��ʽ�����ȶ�����Ҫ�Ƿ�����Щ��Ϣ�������Щ��Ϣ����Ƿ������ڿ����С�</b>
	 * 
	 * @param files
	 *            ��Ҫ�޸�������ʱ����ļ����顣
	 * @since 0.1
	 */
	public static void touch(File[] files) {
		for (int i = 0; i < files.length; i++) {
			touch(files[i]);
		}
	}

	/**
	 * �޸��ļ���������ʱ�䡣 ����ļ��������򴴽����ļ���
	 * <b>Ŀǰ�����������Ϊ��ʽ�����ȶ�����Ҫ�Ƿ�����Щ��Ϣ�������Щ��Ϣ����Ƿ������ڿ����С�</b>
	 * 
	 * @param fileNames
	 *            ��Ҫ�޸�������ʱ����ļ������顣
	 * @since 0.1
	 */
	public static void touch(String[] fileNames) {
		File[] files = new File[fileNames.length];
		for (int i = 0; i < fileNames.length; i++) {
			files[i] = new File(fileNames[i]);
		}
		touch(files);
	}

	/**
	 * �ж�ָ�����ļ��Ƿ���ڡ�
	 * 
	 * @param fileName
	 *            Ҫ�жϵ��ļ����ļ���
	 * @return ����ʱ����true�����򷵻�false��
	 * @since 0.1
	 */
	public static boolean isFileExist(String fileName) {
		return new File(fileName).isFile();
	}

	/**
	 * ����ָ����Ŀ¼�� ���ָ����Ŀ¼�ĸ�Ŀ¼�������򴴽���Ŀ¼����������Ҫ�ĸ�Ŀ¼�� <b>ע�⣺���ܻ��ڷ���false��ʱ�򴴽����ָ�Ŀ¼��</b>
	 * 
	 * @param file
	 *            Ҫ������Ŀ¼
	 * @return ��ȫ�����ɹ�ʱ����true�����򷵻�false��
	 * @since 0.1
	 */
	public static boolean makeDirectory(File file) {
		File parent = file.getParentFile();
		if (parent != null) {
			return parent.mkdirs();
		}
		return false;
	}

	public static boolean createDirectory(String fileName) {
		File file = new File(fileName);
		return file.mkdir();
	}

	/**
	 * ����ָ����Ŀ¼�� ���ָ����Ŀ¼�ĸ�Ŀ¼�������򴴽���Ŀ¼����������Ҫ�ĸ�Ŀ¼�� <b>ע�⣺���ܻ��ڷ���false��ʱ�򴴽����ָ�Ŀ¼��</b>
	 * 
	 * @param fileName
	 *            Ҫ������Ŀ¼��Ŀ¼��
	 * @return ��ȫ�����ɹ�ʱ����true�����򷵻�false��
	 * @since 0.1
	 */
	public static boolean makeDirectory(String fileName) {
		File file = new File(fileName);
		return makeDirectory(file);
	}

	/**
	 * ���ָ��Ŀ¼�е��ļ��� ���������������ɾ�����е��ļ�������ֻҪ��һ���ļ�û�б�ɾ�����᷵��false��
	 * ������������������ɾ����������ɾ����Ŀ¼�������ݡ�
	 * 
	 * @param directory
	 *            Ҫ��յ�Ŀ¼
	 * @return Ŀ¼�µ������ļ������ɹ�ɾ��ʱ����true�����򷵻�false.
	 * @since 0.1
	 */
	public static boolean emptyDirectory(File directory) {
		boolean result = false;
		File[] entries = directory.listFiles();
		for (int i = 0; i < entries.length; i++) {
			if (!entries[i].delete()) {
				result = false;
			}
		}
		return true;
	}

	/**
	 * ���ָ��Ŀ¼�е��ļ��� ���������������ɾ�����е��ļ�������ֻҪ��һ���ļ�û�б�ɾ�����᷵��false��
	 * ������������������ɾ����������ɾ����Ŀ¼�������ݡ�
	 * 
	 * @param directoryName
	 *            Ҫ��յ�Ŀ¼��Ŀ¼��
	 * @return Ŀ¼�µ������ļ������ɹ�ɾ��ʱ����true�����򷵻�false��
	 * @since 0.1
	 */
	public static boolean emptyDirectory(String directoryName) {
		File dir = new File(directoryName);
		return emptyDirectory(dir);
	}

	/**
	 * ɾ��ָ��Ŀ¼�����е��������ݡ�
	 * 
	 * @param dirName
	 *            Ҫɾ����Ŀ¼��Ŀ¼��
	 * @return ɾ���ɹ�ʱ����true�����򷵻�false��
	 * @since 0.1
	 */
	public static boolean deleteDirectory(String dirName) {
		return deleteDirectory(new File(dirName));
	}

	/**
	 * ɾ��ָ��Ŀ¼�����е��������ݡ�
	 * 
	 * @param dir
	 *            Ҫɾ����Ŀ¼
	 * @return ɾ���ɹ�ʱ����true�����򷵻�false��
	 * @since 0.1
	 */
	public static boolean deleteDirectory(File dir) {
		if ((dir == null) || !dir.isDirectory()) {
			throw new IllegalArgumentException("Argument " + dir
					+ " is not a directory. ");
		}

		File[] entries = dir.listFiles();
		int sz = entries.length;

		for (int i = 0; i < sz; i++) {
			if (entries[i].isDirectory()) {
				if (!deleteDirectory(entries[i])) {
					return false;
				}
			} else {
				if (!entries[i].delete()) {
					return false;
				}
			}
		}

		if (!dir.delete()) {
			return false;
		}
		return true;
	}

	/**
	 * �г�Ŀ¼�е��������ݣ���������Ŀ¼�е����ݡ�
	 * 
	 * @param file
	 *            Ҫ�г���Ŀ¼
	 * @param filter
	 *            ������
	 * @return Ŀ¼���ݵ��ļ����顣
	 * @since 0.1
	 */
	public static File[] listAll(File file,
			javax.swing.filechooser.FileFilter filter) {
		ArrayList list = new ArrayList();
		File[] files;
		if (!file.exists() || file.isFile()) {
			return new File[0];
		}
		list(list, file, filter);
		files = new File[list.size()];
		list.toArray(files);
		return files;
	}

	/**
	 * ��Ŀ¼�е�������ӵ��б�
	 * 
	 * @param list
	 *            �ļ��б�
	 * @param filter
	 *            ������
	 * @param file
	 *            Ŀ¼
	 */
	private static void list(ArrayList list, File file,
			javax.swing.filechooser.FileFilter filter) {
		if (filter.accept(file)) {
			list.add(file);
			if (file.isFile()) {
				return;
			}
		}
		if (file.isDirectory()) {
			File files[] = file.listFiles();
			for (int i = 0; i < files.length; i++) {
				list(list, files[i], filter);
			}
		}

	}

	/**
	 * �����ļ���URL��ַ��
	 * 
	 * @param file
	 *            �ļ�
	 * @return �ļ���Ӧ�ĵ�URL��ַ
	 * @throws MalformedURLException
	 * @since 0.4
	 * @deprecated ��ʵ�ֵ�ʱ��û��ע�⵽File�౾���һ��toURL�������ļ�·��ת��ΪURL�� ��ʹ��File.toURL������
	 */
	public static URL getURL(File file) throws MalformedURLException {
		String fileURL = "file:/" + file.getAbsolutePath();
		URL url = new URL(fileURL);
		return url;
	}

	/**
	 * ���ļ�·���õ��ļ�����
	 * 
	 * @param filePath
	 *            �ļ���·�������������·��Ҳ�����Ǿ���·��
	 * @return ��Ӧ���ļ���
	 * @since 0.4
	 */
	public static String getFileName(String filePath) {
		File file = new File(filePath);
		return file.getName();
	}

	/**
	 * ���ļ����õ��ļ�����·����
	 * 
	 * @param fileName
	 *            �ļ���
	 * @return ��Ӧ���ļ�·��
	 * @since 0.4
	 */
	public static String getFilePath(String fileName) {
		File file = new File(fileName);
		return file.getAbsolutePath();
	}

	/**
	 * ��DOS/Windows��ʽ��·��ת��ΪUNIX/Linux��ʽ��·����
	 * ��ʵ���ǽ�·���е�"\"ȫ����Ϊ"/"����Ϊ��ĳЩ���������ת��Ϊ���ַ�ʽ�ȽϷ��㣬
	 * ĳ�г̶���˵"/"��"\"���ʺ���Ϊ·���ָ���������DOS/WindowsҲ��������·���ָ�����
	 * 
	 * @param filePath
	 *            ת��ǰ��·��
	 * @return ת�����·��
	 * @since 0.4
	 */
	public static String toUNIXpath(String filePath) {
		return filePath.replace('\\', '/');
	}

	/**
	 * ���ļ����õ�UNIX�����ļ�����·����
	 * 
	 * @param fileName
	 *            �ļ���
	 * @return ��Ӧ��UNIX�����ļ�·��
	 * @since 0.4
	 * @see #toUNIXpath(String filePath) toUNIXpath
	 */
	public static String getUNIXfilePath(String fileName) {
		File file = new File(fileName);
		return toUNIXpath(file.getAbsolutePath());
	}

	/**
	 * �õ��ļ������͡� ʵ���Ͼ��ǵõ��ļ��������һ����.������Ĳ��֡�
	 * 
	 * @param fileName
	 *            �ļ���
	 * @return �ļ����е����Ͳ���
	 * @since 0.5
	 */
	public static String getTypePart(String fileName) {
		int point = fileName.lastIndexOf('.');
		int length = fileName.length();
		if (point == -1 || point == length - 1) {
			return "";
		} else {
			return fileName.substring(point + 1, length);
		}
	}

	/**
	 * �õ��ļ������͡� ʵ���Ͼ��ǵõ��ļ��������һ����.������Ĳ��֡�
	 * 
	 * @param file
	 *            �ļ�
	 * @return �ļ����е����Ͳ���
	 * @since 0.5
	 */
	public static String getFileType(File file) {
		return getTypePart(file.getName());
	}

	/**
	 * �õ��ļ������ֲ��֡� ʵ���Ͼ���·���е����һ��·���ָ�����Ĳ��֡�
	 * 
	 * @param fileName
	 *            �ļ���
	 * @return �ļ����е����ֲ���
	 * @since 0.5
	 */
	public static String getNamePart(String fileName) {
		int point = getPathLastIndex(fileName);
		int length = fileName.length();
		if (point == -1) {
			return fileName;
		} else if (point == length - 1) {
			int secondPoint = getPathLastIndex(fileName, point - 1);
			if (secondPoint == -1) {
				if (length == 1) {
					return fileName;
				} else {
					return fileName.substring(0, point);
				}
			} else {
				return fileName.substring(secondPoint + 1, point);
			}
		} else {
			return fileName.substring(point + 1);
		}
	}

	/**
	 * �õ��ļ����еĸ�·�����֡� ������·���ָ�������Ч�� ������ʱ����""��
	 * ����ļ�������·���ָ�����β���򲻿��Ǹ÷ָ���������"/path/"����""��
	 * 
	 * @param fileName
	 *            �ļ���
	 * @return ��·���������ڻ����Ѿ��Ǹ�Ŀ¼ʱ����""
	 * @since 0.5
	 */
	public static String getPathPart(String fileName) {
		int point = getPathLastIndex(fileName);
		int length = fileName.length();
		if (point == -1) {
			return "";
		} else if (point == length - 1) {
			int secondPoint = getPathLastIndex(fileName, point - 1);
			if (secondPoint == -1) {
				return "";
			} else {
				return fileName.substring(0, secondPoint);
			}
		} else {
			return fileName.substring(0, point);
		}
	}

	/**
	 * �õ�·���ָ������ļ�·�����״γ��ֵ�λ�á� ����DOS����UNIX���ķָ��������ԡ�
	 * 
	 * @param fileName
	 *            �ļ�·��
	 * @return ·���ָ�����·�����״γ��ֵ�λ�ã�û�г���ʱ����-1��
	 * @since 0.5
	 */
	public static int getPathIndex(String fileName) {
		int point = fileName.indexOf('/');
		if (point == -1) {
			point = fileName.indexOf('\\');
		}
		return point;
	}

	/**
	 * �õ�·���ָ������ļ�·����ָ��λ�ú��״γ��ֵ�λ�á� ����DOS����UNIX���ķָ��������ԡ�
	 * 
	 * @param fileName
	 *            �ļ�·��
	 * @param fromIndex
	 *            ��ʼ���ҵ�λ��
	 * @return ·���ָ�����·����ָ��λ�ú��״γ��ֵ�λ�ã�û�г���ʱ����-1��
	 * @since 0.5
	 */
	public static int getPathIndex(String fileName, int fromIndex) {
		int point = fileName.indexOf('/', fromIndex);
		if (point == -1) {
			point = fileName.indexOf('\\', fromIndex);
		}
		return point;
	}

	/**
	 * �õ�·���ָ������ļ�·���������ֵ�λ�á� ����DOS����UNIX���ķָ��������ԡ�
	 * 
	 * @param fileName
	 *            �ļ�·��
	 * @return ·���ָ�����·���������ֵ�λ�ã�û�г���ʱ����-1��
	 * @since 0.5
	 */
	public static int getPathLastIndex(String fileName) {
		int point = fileName.lastIndexOf('/');
		if (point == -1) {
			point = fileName.lastIndexOf('\\');
		}
		return point;
	}

	/**
	 * �õ�·���ָ������ļ�·����ָ��λ��ǰ�����ֵ�λ�á� ����DOS����UNIX���ķָ��������ԡ�
	 * 
	 * @param fileName
	 *            �ļ�·��
	 * @param fromIndex
	 *            ��ʼ���ҵ�λ��
	 * @return ·���ָ�����·����ָ��λ��ǰ�����ֵ�λ�ã�û�г���ʱ����-1��
	 * @since 0.5
	 */
	public static int getPathLastIndex(String fileName, int fromIndex) {
		int point = fileName.lastIndexOf('/', fromIndex);
		if (point == -1) {
			point = fileName.lastIndexOf('\\', fromIndex);
		}
		return point;
	}

	/**
	 * ���ļ����е����Ͳ���ȥ����
	 * 
	 * @param filename
	 *            �ļ���
	 * @return ȥ�����Ͳ��ֵĽ��
	 * @since 0.5
	 */
	public static String trimType(String filename) {
		int index = filename.lastIndexOf(".");
		if (index != -1) {
			return filename.substring(0, index);
		} else {
			return filename;
		}
	}

	/**
	 * �õ����·���� �ļ�������Ŀ¼�����ӽڵ�ʱ�����ļ�����
	 * 
	 * @param pathName
	 *            Ŀ¼��
	 * @param fileName
	 *            �ļ���
	 * @return �õ��ļ��������Ŀ¼�������·����Ŀ¼�²����ڸ��ļ�ʱ�����ļ���
	 * @since 0.5
	 */
	public static String getSubpath(String pathName, String fileName) {
		int index = fileName.indexOf(pathName);
		if (index != -1) {
			return fileName.substring(index + pathName.length() + 1);
		} else {
			return fileName;
		}
	}

	/**
	 * �����ļ���
	 * 
	 * @param fromFileName
	 *            Դ�ļ���
	 * @param toFileName
	 *            Ŀ���ļ���
	 * @return �ɹ������ļ�ʱ����true�����򷵻�false
	 * @since 0.6
	 */
	public static boolean copy(String fromFileName, String toFileName) {
		return copy(fromFileName, toFileName, false);
	}

	/**
	 * �����ļ���
	 * 
	 * @param fromFileName
	 *            Դ�ļ���
	 * @param toFileName
	 *            Ŀ���ļ���
	 * @param override
	 *            Ŀ���ļ�����ʱ�Ƿ񸲸�
	 * @return �ɹ������ļ�ʱ����true�����򷵻�false
	 * @since 0.6
	 */
	public static boolean copy(String fromFileName, String toFileName,
			boolean override) {
		File fromFile = new File(fromFileName);
		File toFile = new File(toFileName);

		if (!fromFile.exists() || !fromFile.isFile() || !fromFile.canRead()) {
			return false;
		}

		if (toFile.isDirectory()) {
			toFile = new File(toFile, fromFile.getName());

		}
		if (toFile.exists()) {
			if (!toFile.canWrite() || override == false) {
				return false;
			}
		} else {
			String parent = toFile.getParent();
			if (parent == null) {
				parent = System.getProperty("user.dir");
			}
			File dir = new File(parent);
			if (!dir.exists() || dir.isFile() || !dir.canWrite()) {
				return false;
			}
		}

		FileInputStream from = null;
		FileOutputStream to = null;
		try {
			from = new FileInputStream(fromFile);
			to = new FileOutputStream(toFile);
			byte[] buffer = new byte[4096];
			int bytes_read;
			while ((bytes_read = from.read(buffer)) != -1) {
				to.write(buffer, 0, bytes_read);
			}
			return true;
		} catch (IOException e) {
			return false;
		} finally {
			if (from != null) {
				try {
					from.close();
				} catch (IOException e) {
					System.err.println("Exception when close source file");
				}
			}
			if (to != null) {
				try {
					to.close();
				} catch (IOException e) {
					System.err.println("Exception when close target file");
				}
			}
		}
	}

	public static void writeLineToFile(String path, List list) {
		FileWriter tofile;
		BufferedWriter bfw;
		try {
			tofile = new FileWriter(path, false);

			bfw = new BufferedWriter(tofile);
			for (int i = 0; i < list.size(); i++) {
				bfw.write((String) list.get(i));
				bfw.newLine();
			}
			bfw.flush();
			bfw.close();
		} catch (FileNotFoundException e) {
			System.err.println(e);
		} catch (IOException e) {
			System.err.println(e);
		}
	}

	public static void readLineFromFile(String path) {
		FileReader tofile;
		BufferedReader bfw;
		String s = "";
		try {
			tofile = new FileReader(path);
			bfw = new BufferedReader(tofile);

			while ((s = bfw.readLine()) != null) {
				System.out.println(s);
				String[] s1 = s.split(",");
				for (int i = 0; i < s1.length; i++) {
					System.out.println(s1[i]);
				}
			}
			bfw.close();
		} catch (FileNotFoundException e) {
			System.err.println(e);
		} catch (IOException e) {
			System.err.println(e);
		}
	}

	public static ArrayList parseCSV(String lineStr) {
		ArrayList colList = new ArrayList();
		StringBuffer sb = new StringBuffer(lineStr);
		int colFlg = 0;

		boolean comaFlg = false;
		StringBuffer colBuf = new StringBuffer();
		while (sb.length() > 0) {
			char c = sb.charAt(0);
			if (comaFlg == false) {
				if (c == ',') {
					colList.add(colBuf.toString());
					colBuf = new StringBuffer();
				} else if (c == '\"') {
					colFlg = 1;
					char tmpc = '\0';
					if (sb.length() > 1) {
						tmpc = sb.charAt(1);
					}
					if (tmpc == '\"') {
						colFlg = 2;
						sb.deleteCharAt(1);
					}
					comaFlg = true;
				} else {
					colFlg = 2;
					colBuf.append(c);
					comaFlg = true;
				}
			} else {
				if (colFlg == 2 && c == ',') {
					colList.add(colBuf.toString());
					colBuf = new StringBuffer();
					comaFlg = false;
				} else if (colFlg == 1 && c == '\"') {
					char tmpc = '\0';
					if (sb.length() > 1) {
						tmpc = sb.charAt(1);
					}
					if (tmpc == '\"') {
						colBuf.append(tmpc);
						sb.deleteCharAt(1);
					} else {
						colFlg = 2;
					}
				} else {
					colBuf.append(c);
				}
			}
			sb.deleteCharAt(0);
		}
		colList.add(colBuf.toString());
		return colList;
	}

	public static ArrayList parseCSVFile(String filePath) {
		ArrayList lineColList = null;
		;
		try {
			BufferedReader br = null;

			br = new BufferedReader(new FileReader(filePath));

			ArrayList lineList = new ArrayList();

			String s;
			while ((s = br.readLine()) != null) {
				lineList.add(s);
			}

			lineColList = new ArrayList();
			Iterator ite = lineList.iterator();
			while (ite.hasNext()) {
				String lineStr = (String) ite.next();
				lineColList.add(parseCSV(lineStr));
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return lineColList;
	}

	public static int getLineCountOfFile(String path) {
		FileReader tofile;
		BufferedReader bfw;
		String s = "";
		int count = 0;
		try {
			tofile = new FileReader(path);
			bfw = new BufferedReader(tofile);
			while ((s = bfw.readLine()) != null) {
				count++;
			}
			bfw.close();
		} catch (FileNotFoundException e) {
			System.err.println(e);
		} catch (IOException e) {
			System.err.println(e);
		}
		return count;
	}

	public static List getLineContentOfFile(String path) {
		LinkedList list = new LinkedList();
		FileReader tofile;
		BufferedReader bfw;
		String s = "";
		try {
			tofile = new FileReader(path);
			bfw = new BufferedReader(tofile);
			while ((s = bfw.readLine()) != null) {
				list.add(s);
			}
			bfw.close();
		} catch (FileNotFoundException e) {
			System.err.println(e);
		} catch (IOException e) {
			System.err.println(e);
		}
		return list;
	}

	public static void addToFileByLine(String path, int line, String content) {
		List list = getLineContentOfFile(path);
		int lineCount = list == null ? 0 : list.size();
		if (line < 0 || line > lineCount || lineCount == 0)
			return;
		list.add(line, content);
		FileWriter tofile;
		BufferedWriter bfw;
		try {
			tofile = new FileWriter(path, false);

			bfw = new BufferedWriter(tofile);
			for (int i = 0; i < list.size(); i++) {
				bfw.write((String) list.get(i));
				bfw.newLine();
			}
			bfw.flush();
			bfw.close();
		} catch (FileNotFoundException e) {
			System.err.println(e);
		} catch (IOException e) {
			System.err.println(e);
		}
	}

	/**
	 * �õ�һ��Ŀ¼������Ŀ¼�µ������ļ�
	 * 
	 * @param path
	 * @return
	 */
	public static List getReclusiveDirFile(String path, List list) {

		try {
			File f = new File(path);
			if (f.isDirectory()) {
				File[] fList = f.listFiles();
				for (int j = 0; j < fList.length; j++) {
					if (fList[j].isDirectory()) {
						// System.out.println(fList[j].getPath());
						getReclusiveDirFile(fList[j].getPath(), list); // ��getReclusiveDirFile���������ֵ�����getReclusiveDirFile��������
					}
				}
				for (int j = 0; j < fList.length; j++) {

					if (fList[j].isFile()) {
						// System.out.println(fList[j].getPath());
						list.add(fList[j]);
					}

				}
			}
		} catch (Exception e) {
			System.out.println("Error�� " + e);
		}
		return list;
	}

	/**
	 * �õ�һ��Ŀ¼������Ŀ¼
	 * 
	 * @param path
	 * @return
	 */
	public static List getDir(String path) {

		LinkedList list = new LinkedList();
		try {
			File f = new File(path);
			if (f.isDirectory()) {
				File[] fList = f.listFiles();
				for (int j = 0; j < fList.length; j++) {
					if (fList[j].isDirectory()) {
						list.add(fList[j]);
					}
				}

			}
		} catch (Exception e) {
			System.out.println("Error�� " + e);
		}
		return list;
	}

	/**
	 * �õ�һ��Ŀ¼�������ļ�
	 * 
	 * @param path
	 * @return
	 */
	public static List getDirFile(String path) {

		LinkedList list = new LinkedList();
		try {
			File f = new File(path);
			if (f.isDirectory()) {
				File[] fList = f.listFiles();
				for (int j = 0; j < fList.length; j++) {
					if (fList[j].isFile()) {
						list.add(fList[j]);
					}
				}

			}
		} catch (Exception e) {
			System.out.println("Error�� " + e);
		}
		return list;
	}

	public static void main(String[] args) {
		List list = getDir("E:\\zxl\\����\\cbms��Ƭ\\��ý��");
		List listFile = null;
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			File file = (File) list.get(i);
			listFile = getDirFile(file.getAbsolutePath());
			for (int j = 0; j < listFile.size(); j++)
				System.out.println("  " + listFile.get(j));
		}

		File file = null;
		// System.out.println(list.size());
		// int count=0;
		// for(int i=0;i<list.size();i++)
		// {
		// file=(File)list.get(i);
		// if(file.getName().indexOf("ȫ����")==-1&&file.getName().indexOf(".db")==-1)
		// {
		// System.out.println(file.getName());
		// count++;
		// }
		//			
		// }
		// System.out.println(count);
		// FileFilter filter=new FileFilter();
		// File[] listFile=listAll(new File("E:\\zxl\\����\\��ý��\\��ý��"), filter);
		// System.out.println(listFile.length);
		// addToFileByLine("D:\\zxl\\gencode\\Projdetailparent\\ProjdetailDAO.java",5,"yyyy");
		// ArrayList list = parseCSVFile("D:/aa.txt");
		// for (int i = 0; i < list.size(); i++) {
		// //System.out.println(list.get(i));
		// ArrayList collist = (ArrayList) list.get(i);
		// for (int j = 0; j < collist.size(); j++) {
		// System.out.print(collist.get(j) + " ");
		// }
		// System.out.println();
		// }
	}
}
