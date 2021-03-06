package com.rosy.util;

/**
 * Copyright: Copyright (c) 2002-2004
 * Company: JavaResearch(http://www.javaresearch.org)
 * 最后更新日期:2003年5月18日
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
 * 此类中封装一些常用的文件操作。 所有方法都是静态方法，不需要生成此类的实例， 为避免生成此类的实例，构造方法被申明为private类型的。
 * 
 * @since 0.1
 */

public class FileUtil {
	/**
	 * 私有构造方法，防止类的实例化，因为工具类不需要实例化。
	 */
	private FileUtil() {

	}

	/**
	 * 修改文件的最后访问时间。 如果文件不存在则创建该文件。
	 * <b>目前这个方法的行为方式还不稳定，主要是方法有些信息输出，这些信息输出是否保留还在考虑中。</b>
	 * 
	 * @param file
	 *            需要修改最后访问时间的文件。
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
	 * 修改文件的最后访问时间。 如果文件不存在则创建该文件。
	 * <b>目前这个方法的行为方式还不稳定，主要是方法有些信息输出，这些信息输出是否保留还在考虑中。</b>
	 * 
	 * @param fileName
	 *            需要修改最后访问时间的文件的文件名。
	 * @since 0.1
	 */
	public static void touch(String fileName) {
		File file = new File(fileName);
		touch(file);
	}

	/**
	 * 修改文件的最后访问时间。 如果文件不存在则创建该文件。
	 * <b>目前这个方法的行为方式还不稳定，主要是方法有些信息输出，这些信息输出是否保留还在考虑中。</b>
	 * 
	 * @param files
	 *            需要修改最后访问时间的文件数组。
	 * @since 0.1
	 */
	public static void touch(File[] files) {
		for (int i = 0; i < files.length; i++) {
			touch(files[i]);
		}
	}

	/**
	 * 修改文件的最后访问时间。 如果文件不存在则创建该文件。
	 * <b>目前这个方法的行为方式还不稳定，主要是方法有些信息输出，这些信息输出是否保留还在考虑中。</b>
	 * 
	 * @param fileNames
	 *            需要修改最后访问时间的文件名数组。
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
	 * 判断指定的文件是否存在。
	 * 
	 * @param fileName
	 *            要判断的文件的文件名
	 * @return 存在时返回true，否则返回false。
	 * @since 0.1
	 */
	public static boolean isFileExist(String fileName) {
		return new File(fileName).isFile();
	}

	/**
	 * 创建指定的目录。 如果指定的目录的父目录不存在则创建其目录书上所有需要的父目录。 <b>注意：可能会在返回false的时候创建部分父目录。</b>
	 * 
	 * @param file
	 *            要创建的目录
	 * @return 完全创建成功时返回true，否则返回false。
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
	 * 创建指定的目录。 如果指定的目录的父目录不存在则创建其目录书上所有需要的父目录。 <b>注意：可能会在返回false的时候创建部分父目录。</b>
	 * 
	 * @param fileName
	 *            要创建的目录的目录名
	 * @return 完全创建成功时返回true，否则返回false。
	 * @since 0.1
	 */
	public static boolean makeDirectory(String fileName) {
		File file = new File(fileName);
		return makeDirectory(file);
	}

	/**
	 * 清空指定目录中的文件。 这个方法将尽可能删除所有的文件，但是只要有一个文件没有被删除都会返回false。
	 * 另外这个方法不会迭代删除，即不会删除子目录及其内容。
	 * 
	 * @param directory
	 *            要清空的目录
	 * @return 目录下的所有文件都被成功删除时返回true，否则返回false.
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
	 * 清空指定目录中的文件。 这个方法将尽可能删除所有的文件，但是只要有一个文件没有被删除都会返回false。
	 * 另外这个方法不会迭代删除，即不会删除子目录及其内容。
	 * 
	 * @param directoryName
	 *            要清空的目录的目录名
	 * @return 目录下的所有文件都被成功删除时返回true，否则返回false。
	 * @since 0.1
	 */
	public static boolean emptyDirectory(String directoryName) {
		File dir = new File(directoryName);
		return emptyDirectory(dir);
	}

	/**
	 * 删除指定目录及其中的所有内容。
	 * 
	 * @param dirName
	 *            要删除的目录的目录名
	 * @return 删除成功时返回true，否则返回false。
	 * @since 0.1
	 */
	public static boolean deleteDirectory(String dirName) {
		return deleteDirectory(new File(dirName));
	}

	/**
	 * 删除指定目录及其中的所有内容。
	 * 
	 * @param dir
	 *            要删除的目录
	 * @return 删除成功时返回true，否则返回false。
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
	 * 列出目录中的所有内容，包括其子目录中的内容。
	 * 
	 * @param file
	 *            要列出的目录
	 * @param filter
	 *            过滤器
	 * @return 目录内容的文件数组。
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
	 * 将目录中的内容添加到列表。
	 * 
	 * @param list
	 *            文件列表
	 * @param filter
	 *            过滤器
	 * @param file
	 *            目录
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
	 * 返回文件的URL地址。
	 * 
	 * @param file
	 *            文件
	 * @return 文件对应的的URL地址
	 * @throws MalformedURLException
	 * @since 0.4
	 * @deprecated 在实现的时候没有注意到File类本身带一个toURL方法将文件路径转换为URL。 请使用File.toURL方法。
	 */
	public static URL getURL(File file) throws MalformedURLException {
		String fileURL = "file:/" + file.getAbsolutePath();
		URL url = new URL(fileURL);
		return url;
	}

	/**
	 * 从文件路径得到文件名。
	 * 
	 * @param filePath
	 *            文件的路径，可以是相对路径也可以是绝对路径
	 * @return 对应的文件名
	 * @since 0.4
	 */
	public static String getFileName(String filePath) {
		File file = new File(filePath);
		return file.getName();
	}

	/**
	 * 从文件名得到文件绝对路径。
	 * 
	 * @param fileName
	 *            文件名
	 * @return 对应的文件路径
	 * @since 0.4
	 */
	public static String getFilePath(String fileName) {
		File file = new File(fileName);
		return file.getAbsolutePath();
	}

	/**
	 * 将DOS/Windows格式的路径转换为UNIX/Linux格式的路径。
	 * 其实就是将路径中的"\"全部换为"/"，因为在某些情况下我们转换为这种方式比较方便，
	 * 某中程度上说"/"比"\"更适合作为路径分隔符，而且DOS/Windows也将它当作路径分隔符。
	 * 
	 * @param filePath
	 *            转换前的路径
	 * @return 转换后的路径
	 * @since 0.4
	 */
	public static String toUNIXpath(String filePath) {
		return filePath.replace('\\', '/');
	}

	/**
	 * 从文件名得到UNIX风格的文件绝对路径。
	 * 
	 * @param fileName
	 *            文件名
	 * @return 对应的UNIX风格的文件路径
	 * @since 0.4
	 * @see #toUNIXpath(String filePath) toUNIXpath
	 */
	public static String getUNIXfilePath(String fileName) {
		File file = new File(fileName);
		return toUNIXpath(file.getAbsolutePath());
	}

	/**
	 * 得到文件的类型。 实际上就是得到文件名中最后一个“.”后面的部分。
	 * 
	 * @param fileName
	 *            文件名
	 * @return 文件名中的类型部分
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
	 * 得到文件的类型。 实际上就是得到文件名中最后一个“.”后面的部分。
	 * 
	 * @param file
	 *            文件
	 * @return 文件名中的类型部分
	 * @since 0.5
	 */
	public static String getFileType(File file) {
		return getTypePart(file.getName());
	}

	/**
	 * 得到文件的名字部分。 实际上就是路径中的最后一个路径分隔符后的部分。
	 * 
	 * @param fileName
	 *            文件名
	 * @return 文件名中的名字部分
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
	 * 得到文件名中的父路径部分。 对两种路径分隔符都有效。 不存在时返回""。
	 * 如果文件名是以路径分隔符结尾的则不考虑该分隔符，例如"/path/"返回""。
	 * 
	 * @param fileName
	 *            文件名
	 * @return 父路径，不存在或者已经是父目录时返回""
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
	 * 得到路径分隔符在文件路径中首次出现的位置。 对于DOS或者UNIX风格的分隔符都可以。
	 * 
	 * @param fileName
	 *            文件路径
	 * @return 路径分隔符在路径中首次出现的位置，没有出现时返回-1。
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
	 * 得到路径分隔符在文件路径中指定位置后首次出现的位置。 对于DOS或者UNIX风格的分隔符都可以。
	 * 
	 * @param fileName
	 *            文件路径
	 * @param fromIndex
	 *            开始查找的位置
	 * @return 路径分隔符在路径中指定位置后首次出现的位置，没有出现时返回-1。
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
	 * 得到路径分隔符在文件路径中最后出现的位置。 对于DOS或者UNIX风格的分隔符都可以。
	 * 
	 * @param fileName
	 *            文件路径
	 * @return 路径分隔符在路径中最后出现的位置，没有出现时返回-1。
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
	 * 得到路径分隔符在文件路径中指定位置前最后出现的位置。 对于DOS或者UNIX风格的分隔符都可以。
	 * 
	 * @param fileName
	 *            文件路径
	 * @param fromIndex
	 *            开始查找的位置
	 * @return 路径分隔符在路径中指定位置前最后出现的位置，没有出现时返回-1。
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
	 * 将文件名中的类型部分去掉。
	 * 
	 * @param filename
	 *            文件名
	 * @return 去掉类型部分的结果
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
	 * 得到相对路径。 文件名不是目录名的子节点时返回文件名。
	 * 
	 * @param pathName
	 *            目录名
	 * @param fileName
	 *            文件名
	 * @return 得到文件名相对于目录名的相对路径，目录下不存在该文件时返回文件名
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
	 * 拷贝文件。
	 * 
	 * @param fromFileName
	 *            源文件名
	 * @param toFileName
	 *            目标文件名
	 * @return 成功生成文件时返回true，否则返回false
	 * @since 0.6
	 */
	public static boolean copy(String fromFileName, String toFileName) {
		return copy(fromFileName, toFileName, false);
	}

	/**
	 * 拷贝文件。
	 * 
	 * @param fromFileName
	 *            源文件名
	 * @param toFileName
	 *            目标文件名
	 * @param override
	 *            目标文件存在时是否覆盖
	 * @return 成功生成文件时返回true，否则返回false
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
	 * 得到一个目录及其子目录下的所有文件
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
						getReclusiveDirFile(fList[j].getPath(), list); // 在getReclusiveDirFile函数里面又调用了getReclusiveDirFile函数本身
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
			System.out.println("Error： " + e);
		}
		return list;
	}

	/**
	 * 得到一个目录的所有目录
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
			System.out.println("Error： " + e);
		}
		return list;
	}

	/**
	 * 得到一个目录的所有文件
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
			System.out.println("Error： " + e);
		}
		return list;
	}

	public static void main(String[] args) {
		List list = getDir("E:\\zxl\\工作\\cbms照片\\多媒体");
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
		// if(file.getName().indexOf("全桥照")==-1&&file.getName().indexOf(".db")==-1)
		// {
		// System.out.println(file.getName());
		// count++;
		// }
		//			
		// }
		// System.out.println(count);
		// FileFilter filter=new FileFilter();
		// File[] listFile=listAll(new File("E:\\zxl\\工作\\多媒体\\多媒体"), filter);
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
