package com.urunner.khweb.entity.board;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name = "qna_member")
public class QnAMember {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_no")
    private Long memberNo;

    @Column(length = 100, nullable = false)
    private Long boardNo;

    @Column(length = 100, nullable = false)
    private String email;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(length = 200, nullable = false)
    private String introduce;

    @CreationTimestamp
    private Date regDate;

    public QnAMember(Long boardNo, String email, String name, String introduce) {
        this.boardNo = boardNo;
        this.email = email;
        this.name = name;
        this.introduce = introduce;
    }
//    insert into study_member (board_no, email, introduce, name) value (3, "start132@naver.com", "ㅎㅇㅎㅇ", "야옹이")
}