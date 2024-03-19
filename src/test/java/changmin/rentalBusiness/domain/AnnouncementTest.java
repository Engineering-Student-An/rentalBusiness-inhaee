//package changmin.rentalBusiness.domain;
//
//import changmin.rentalBusiness.repository.RuleRepository;
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.transaction.annotation.Transactional;
//
//@SpringBootTest
//@Transactional
//class AnnouncementTest {
//
//    @Autowired
//    RuleRepository announcementRepository;
//
//    @Test
//    public void 공지사항_생성() throws Exception {
//        //given
//        Rule announcement1 = new Rule();
//        announcement1.setTitle("제목");
//        announcement1.setContent("내용");
//        Rule announcement2 = new Rule("제목", "내용");
//
//        //when
//        announcementRepository.save(announcement1);
//        announcementRepository.save(announcement2);
//
//
//        //then
//        Assertions.assertThat(announcement1.getTitle()).isEqualTo(announcement2.getTitle());
//        Assertions.assertThat(announcement1.getContent()).isEqualTo(announcement2.getContent());
//        Assertions.assertThat(announcement2.getId()).isNotNull();
//
//    }
//
//
//
//
//
//
//
//    @Test
//    public void 공지사항_편집() throws Exception {
//        //given
//
//        //when
//
//        //then
//    }
//}