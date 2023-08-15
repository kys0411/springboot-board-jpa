package programmers.jpaBoard.entity;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PostTest {

    @Test
    void updatePostTest() {
        Post post = new Post("title", "content");

        post.updatePost(null, "updatedContent");

        Assertions.assertThat(post.getTitle()).isEqualTo("title");
        Assertions.assertThat(post.getContent()).isEqualTo("updatedContent");
    }
}