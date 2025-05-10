package ch18.sec11;

import java.io.File;

import java.text.SimpleDateFormat;

import java.util.Date;

public class FileExample {
    public static void main(String[] args) throws Exception {
//File 객체 생성

        File file = new File("C:/temp/file1.txt");

        // 파일 존재 여부 확인
        if (file.exists()) {
            // 존재하면 파일인지 디렉토리인지 확인
            if (file.isFile()) {
                // 파일인 경우
                System.out.println("파일 경로: " + file.getAbsolutePath());
                System.out.println("파일 크기: " + file.length() + " 바이트");
            } else if (file.isDirectory()) {
                // 디렉토리인 경우
                System.out.println("<dir> " + file.getAbsolutePath());
            }
        } else {
            // 존재하지 않는 경우
            System.out.println("해당 파일은 없는 파일입니다.");
        }
    }
}