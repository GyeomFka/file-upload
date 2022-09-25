package hello.upload.domain;

import lombok.Data;

@Data
public class UploadFile {

    public UploadFile(String uploadFileName, String storeFileName) {
        this.uploadFileName = uploadFileName;
        this.storeFileName = storeFileName;
    }

    /***
     * 고객이 업로드한 파일명
     */
    private String uploadFileName;

    /***
     * 서버 내부에서 관리하는 파일명
     */
    private String storeFileName;
}
