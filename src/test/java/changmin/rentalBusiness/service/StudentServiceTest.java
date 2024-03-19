//package changmin.rentalBusiness.service;
//
//import changmin.rentalBusiness.domain.Student;
//import changmin.rentalBusiness.domain.StudentRole;
//import changmin.rentalBusiness.domain.dto.ChangePasswordRequest;
//import changmin.rentalBusiness.domain.dto.JoinRequest;
//import changmin.rentalBusiness.domain.dto.LoginRequest;
//import changmin.rentalBusiness.repository.StudentRepository;
//import org.assertj.core.api.Assertions;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.transaction.annotation.Transactional;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//@Transactional
//public class StudentServiceTest {
//
//    @Autowired StudentRepository studentRepository;
//    @Autowired StudentService studentService;
//
//    @Test
//    public void 회원가입(){
//        //given
//        JoinRequest joinRequest = join();
//
//        //when
//        studentService.join(joinRequest);
//
//        //then
//        assertThat(studentRepository.findByStuId("12191496").getName()).isEqualTo("안창민");
//        assertThat(studentRepository.findByStuId("12191496").getRole()).isEqualTo(StudentRole.USER);
//    }
//
//
//
//    @Test
//    public void 로그인() throws Exception {
//        //given
//        JoinRequest joinRequest = join();
//        studentService.join(joinRequest);
//
//        LoginRequest loginRequest = new LoginRequest();
//        loginRequest.setStuId("12191496");
//        loginRequest.setPassword("1234");
//
//        //when
//        Student login = studentService.login(loginRequest);
//
//        //then
//        assertThat(login.getName()).isEqualTo("안창민");
//        assertThat(login).isSameAs(studentService.findStudent("12191496"));
//    }
//
//    @Test
//    public void 로그인_실패() throws Exception {
//        //given
//        JoinRequest joinRequest = join();
//        studentService.join(joinRequest);
//
//        LoginRequest loginRequest1 = new LoginRequest();
//        loginRequest1.setStuId("1000000");
//        loginRequest1.setPassword("1234");
//
//        LoginRequest loginRequest2 = new LoginRequest();
//        loginRequest2.setStuId("12191496");
//        loginRequest2.setPassword("1111");
//
//        //when
//        Student login1 = studentService.login(loginRequest1);
//        Student login2 = studentService.login(loginRequest2);
//
//        //then
//        assertThat(login1).isNull();
//        assertThat(login2).isNull();
//    }
//
//    @Test
//    public void 비밀번호_변경() throws Exception {
//        //given
//        JoinRequest joinRequest = join();
//        studentService.join(joinRequest);
//        Student student = studentService.findStudent(joinRequest.getStuId());
//
//        ChangePasswordRequest request = new ChangePasswordRequest();
//        request.setCurrentPassword("1234");
//        request.setChangePassword("edit_password");
//        request.setChangePasswordCheck("edit_password");
//
//        //when
//        studentService.changePassword(joinRequest.getStuId(), request);
//
//        //then
//        Assertions.assertThat(student.getPassword()).isEqualTo("edit_password");
//    }
//
//    @Test
//    public void 비밀번호_변경_실패() throws Exception {
//        //given
//        JoinRequest joinRequest = join();
//        studentService.join(joinRequest);
//
//        ChangePasswordRequest request = new ChangePasswordRequest();
//        request.setCurrentPassword("1234");
//        request.setChangePassword("1234");
//        request.setChangePasswordCheck("1234");
//
//        //when
//        studentService.changePassword(joinRequest.getStuId(), request);
//
//        //then
//
//    }
//
//    private static JoinRequest join() {
//        JoinRequest joinRequest = new JoinRequest();
//        joinRequest.setStuId("12191496");
//        joinRequest.setName("안창민");
//        joinRequest.setPassword("1234");
//        joinRequest.setPasswordCheck("1234");
//        return joinRequest;
//    }
//}