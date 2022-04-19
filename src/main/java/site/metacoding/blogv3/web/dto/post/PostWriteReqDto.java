package site.metacoding.blogv3.web.dto.post;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PostWriteReqDto {

    @NotBlank
    private Integer categoryId;
    @Size(min = 1, max = 60)
    @NotBlank
    private String title;
    @NotNull // 공백은 허용이지만 키값은 보내야해서 낫널 넣음
    private MultipartFile thumnailFile; // 썸네일 null 허용
    @NotNull
    private String content; // 컨텐트 null 허용
}
