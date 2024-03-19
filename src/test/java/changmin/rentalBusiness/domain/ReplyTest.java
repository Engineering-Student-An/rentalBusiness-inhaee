//package changmin.rentalBusiness.domain;
//
//import changmin.rentalBusiness.domain.dto.BoardForm;
//import changmin.rentalBusiness.domain.dto.ReplyForm;
//import changmin.rentalBusiness.repository.ReplyRepository;
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.dao.DataIntegrityViolationException;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.time.LocalDateTime;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//
//@SpringBootTest
//@Transactional
//class ReplyTest {
//
//    @Autowired
//    ReplyRepository replyRepository;
//
//    @Test
//    public void 댓글_생성() throws Exception {
//        //given
//        BoardForm boardForm = createBoard();
//        Board board = new Board(boardForm.getStuId(), boardForm.getName(), boardForm.getTitle(), boardForm.getContent(), LocalDateTime.now(), boardForm.isNotice());
//
//        ReplyForm replyForm = new ReplyForm();
//        replyForm.setContent("댓글내용1");
//
//        //when
//        Reply reply = Reply.createReply("12191496", "안창민", replyForm.getContent(), board);
//        replyRepository.save(reply);
//
//        //then
//        assertThat(board.getReplyList().size()).isEqualTo(1);
//        assertThat(reply.getBoard()).isEqualTo(board);
//        assertThat(reply.getStuId()).isEqualTo("12191496");
//        assertThat(reply.getName()).isEqualTo("안창민");
//        assertThat(reply.getWriteTime()).isNotNull();
//        assertThat(reply.getId()).isNotNull();
//    }
//
//    @Test
//    public void 댓글_내용5000자_확인() throws Exception {
//        //given
//        String content = "";
//        for (int i = 0; i <= 5000; i++) {
//            content += "a";
//        }
//        BoardForm boardForm = createBoard();
//        Board board = new Board(boardForm.getStuId(), boardForm.getName(), boardForm.getTitle(), boardForm.getContent(), LocalDateTime.now(), boardForm.isNotice());
//
//        //when
//        ReplyForm replyForm = new ReplyForm();
//        replyForm.setContent(content);
//        Reply reply = Reply.createReply("12191496", "안창민", replyForm.getContent(), board);
//        assertThat(reply.getContent()).isEqualTo(content);
//
//        //then
//        assertThrows(DataIntegrityViolationException.class, () ->  replyRepository.save(reply));
//    }
//
//    @Test
//    public void 댓글_좋아요() throws Exception {
//
//        //given
//        BoardForm boardForm = createBoard();
//        Board board = new Board(boardForm.getStuId(), boardForm.getName(), boardForm.getTitle(), boardForm.getContent(), LocalDateTime.now(), boardForm.isNotice());
//
//        ReplyForm replyForm = new ReplyForm();
//        replyForm.setContent("댓글내용1");
//
//        Reply reply = Reply.createReply("12191496", "안창민", replyForm.getContent(), board);
//
//        //when
//        reply.like("12190000");
//
//        //then
//        Assertions.assertThat(reply.getLikeNumber().size()).isEqualTo(1);
//        Assertions.assertThat(reply.getLikeNumber().contains("12190000")).isEqualTo(true);
//        Assertions.assertThat(reply.isLike("12190000")).isEqualTo(true);
//        Assertions.assertThat(board.isLike("22222222")).isEqualTo(false);
//    }
//
//    @Test
//    public void 댓글_좋아요_취소() throws Exception {
//
//        //given
//        BoardForm boardForm = createBoard();
//        Board board = new Board(boardForm.getStuId(), boardForm.getName(), boardForm.getTitle(), boardForm.getContent(), LocalDateTime.now(), boardForm.isNotice());
//
//        ReplyForm replyForm = new ReplyForm();
//        replyForm.setContent("댓글내용1");
//
//        Reply reply = Reply.createReply("12191496", "안창민", replyForm.getContent(), board);
//
//        //when
//        reply.like("12190000");
//        reply.like("12190000");
//
//        //then
//        Assertions.assertThat(reply.getLikeNumber().size()).isEqualTo(0);
//        Assertions.assertThat(reply.getLikeNumber().contains("12190000")).isEqualTo(false);
//        Assertions.assertThat(reply.isLike("12190000")).isEqualTo(false);
//    }
//
//    private static BoardForm createBoard() {
//        BoardForm boardForm = new BoardForm();
//        boardForm.setStuId("12191496");
//        boardForm.setName("안창민");
//        boardForm.setNotice(false);
//        boardForm.setTitle("제목1");
//        boardForm.setContent("내용1");
//        boardForm.setLikeNumber(0);
//
//        return boardForm;
//    }
//
//}