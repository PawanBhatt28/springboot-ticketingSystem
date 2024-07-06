package kapture.project.ticketing_sytem.dto;

import kapture.project.ticketing_sytem.entity.Ticket;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto {
    private String message;
    private String status;
    private TicketDto object;
}
