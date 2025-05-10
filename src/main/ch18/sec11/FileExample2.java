package ch18.sec11;

import java.io.File;

public class FileExample2 {

        public static void main(String[] args) throws Exception {
            // 1. file1.txt 확인
            File file = new File("C:/temp/file1.txt");

            if (file.exists()) {
                if (file.isFile()) {
                    System.out.println("파일 경로: " + file.getAbsolutePath());
                    System.out.println("파일 크기: " + file.length() + " 바이트");
                } else if (file.isDirectory()) {
                    System.out.println("<dir> " + file.getAbsolutePath());
                }
            } else {
                System.out.println("해당 파일은 없는 파일입니다.");
            }

            // 2. images 디렉토리 확인 및 없으면 생성
            File imagesDir = new File("C:/temp/images");

            if (!imagesDir.exists()) {
                boolean created = imagesDir.mkdirs();
                if (created) {
                    System.out.println("디렉토리를 생성했습니다: " + imagesDir.getAbsolutePath());
                } else {
                    System.out.println("디렉토리 생성에 실패했습니다.");
                }
            } else {
                System.out.println("디렉토리가 이미 존재합니다: " + imagesDir.getAbsolutePath());
            }
        }
    }

