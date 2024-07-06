package kapture.project.ticketing_sytem.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="ticket", indexes = {@Index(name="index_clientid_token_code", columnList = "client_id, ticket_code")})
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="client_id")
    private Integer clientId;

    @Column(name="ticket_code")
    private Integer ticket_code;

    @Column(name="title")
    private String title;

    @Column(name="last_modified_date")
    private Timestamp lastModifiedDate;

    @Column(name="status")
    private String status;
}