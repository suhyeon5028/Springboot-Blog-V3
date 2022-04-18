package site.metacoding.blogv3.web.dto.post;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import site.metacoding.blogv3.domain.category.Category;
import site.metacoding.blogv3.domain.post.Post;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PostRespDto {
    private List<Post> posts;
    private List<Category> categorys;
}
