//package changmin.rentalBusiness.domain;
//
//import changmin.rentalBusiness.domain.dto.BoardForm;
//import changmin.rentalBusiness.service.BoardService;
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.dao.DataIntegrityViolationException;
//
//import java.time.LocalDateTime;
//
//import static org.junit.jupiter.api.Assertions.assertThrows;
//
//@SpringBootTest
//class BoardTest {
//
//    @Test
//    public void 게시글_생성() throws Exception {
//        //given
//        BoardForm boardForm = createBoard();
//
//        //when
//        Board board = new Board(boardForm.getStuId(), boardForm.getName(), boardForm.getTitle(), boardForm.getContent(), LocalDateTime.now(), boardForm.isNotice());
//        Board board2 = new Board(boardForm.getStuId(), boardForm.getName(), null, boardForm.getContent(), LocalDateTime.now(), boardForm.isNotice());
//
//        //then
//        Assertions.assertThat(board.getStuId()).isEqualTo("12191496");
//        Assertions.assertThat(board.getName()).isEqualTo("안창민");
//        Assertions.assertThat(board.getTitle()).isEqualTo("제목1");
//        Assertions.assertThat(board.getContent()).isEqualTo("내용1");
//        Assertions.assertThat(board.isNotice()).isEqualTo(false);
//        Assertions.assertThat(board.getWriteTime()).isNotNull();
//        Assertions.assertThat(board2.getId()).isNull();
//    }
//
//
//    @Autowired
//    BoardService boardService;
//
//    @Test
//    public void 게시글_내용5000자_확인() throws Exception {
//        //given
//        String content = "";
//        for (int i = 0; i < 5100; i++) {
//            content += "a";
//        }
//
//        //when
//        BoardForm boardForm = createBoard();
//        Board board = new Board(boardForm.getStuId(), boardForm.getName(), boardForm.getTitle(), content, LocalDateTime.now(), boardForm.isNotice());
//
//
//        //then
//        assertThrows(DataIntegrityViolationException.class, () ->  boardService.saveBoard(board));
//    }
//
//    @Test
//    public void 게시글_편집() throws Exception {
//        //given
//        BoardForm boardForm = createBoard();
//        Board board = new Board(boardForm.getStuId(), boardForm.getName(), boardForm.getTitle(), boardForm.getContent(), LocalDateTime.now(), boardForm.isNotice());
//
//        //when
//        boardForm.setTitle("편집제목");
//        boardForm.setContent("편집내용");
//        board.edit(boardForm);
//
//        //then
//        Assertions.assertThat(board.getEditTime()).isNotNull();
//        Assertions.assertThat(board.getTitle()).isEqualTo("편집제목");
//        Assertions.assertThat(board.getContent()).isEqualTo("편집내용");
//
//    }
//
//    @Test
//    public void 게시글_좋아요() throws Exception {
//
//        //given
//        BoardForm boardForm = createBoard();
//        Board board = new Board(boardForm.getStuId(), boardForm.getName(), boardForm.getTitle(), boardForm.getContent(), LocalDateTime.now(), boardForm.isNotice());
//
//        //when
//        board.like("11111111");
//
//        //then
//        Assertions.assertThat(board.getLikeNumber().size()).isEqualTo(1);
//        Assertions.assertThat(board.isLike("11111111")).isEqualTo(true);
//        Assertions.assertThat(board.isLike("22222222")).isEqualTo(false);
//    }
//
//    @Test
//    public void 게시글_좋아요_취소() throws Exception {
//
//        //given
//        BoardForm boardForm = createBoard();
//        Board board = new Board(boardForm.getStuId(), boardForm.getName(), boardForm.getTitle(), boardForm.getContent(), LocalDateTime.now(), boardForm.isNotice());
//
//        //when
//        board.like("11111111");
//        board.like("11111111");
//
//        //then
//        Assertions.assertThat(board.getLikeNumber().size()).isEqualTo(0);
//        Assertions.assertThat(board.isLike("11111111")).isEqualTo(false);
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
//}