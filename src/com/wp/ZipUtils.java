package com.wp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * 
 * @author swiftwen
 * @date 2020年2月24日 下午9:50:53
 */
public class ZipUtils {

	/**
	 * 
	 * @param zipPath
	 *            压缩包路径
	 * @param map
	 *            key 压缩后的文件夹名称 value:对应的文件绝对路径
	 * @return
	 */
	public static boolean compressFiles(String zipPath, Map<String, List<String>> map) {
		if (zipPath == null || zipPath.trim().length() == 0 || map == null) {
			return true;
		}
		ZipOutputStream zos = null;
		try {
			File zipFile = new File(zipPath);
			if(!zipFile.exists()){
				zipFile.mkdirs();
			}
			zos = new ZipOutputStream(new FileOutputStream(zipFile));
			for (Map.Entry<String, List<String>> entry : map.entrySet()) {
				String fileFolderName = entry.getKey().trim();
				List<String> fileList = entry.getValue();
				for (String filePath : fileList) {
					File file = new File(filePath);
					ZipEntry zipEntry = new ZipEntry(fileFolderName + File.separator + file.getName());
					zos.putNextEntry(zipEntry);

					int len = 0;
					byte[] buffer = new byte[1024];
					FileInputStream fis = new FileInputStream(file);
					while ((len = fis.read(buffer)) > 0) {
						zos.write(buffer, 0, len);
						zos.flush();
					}
					zos.closeEntry();
					fis.close();
				}
				zos.flush();
			}

		} catch (Exception e) {

		} finally {
			if (null != zos) {
				try {
					zos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, List<String>> map = new HashMap<>();
		String folderName1 = "wen";
		List<String> list1 = new ArrayList<>();
		list1.add("f://保理无追明保-两方（宽限期）-清洁版.pdf");
		list1.add("f://2.txt");
		map.put(folderName1, list1);

		String folderName2 = "peng";
		List<String> list2 = new ArrayList<>();
		list2.add("f://3.txt");
		list2.add("f://4.txt");
		map.put(folderName2, list2);
		compressFiles("f://wenpeng.zip", map);

	}

}
