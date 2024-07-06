package kapture.project.ticketing_sytem.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketDto {
    private Integer clientId;
    private Integer ticketCode;
    private Integer limit;
    private String title;
    private String status;
}
