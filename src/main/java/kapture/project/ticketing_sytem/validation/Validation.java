package kapture.project.ticketing_sytem.validation;

import kapture.project.ticketing_sytem.dto.ResponseDto;
import kapture.project.ticketing_sytem.entity.Ticket;
import kapture.project.ticketing_sytem.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import kapture.project.ticketing_sytem.dto.TicketDto;
import org.springframework.http.ResponseEntity;

public class Validation{

    @Autowired
    TicketRepository ticketRepository;
    @Autowired
    Ticket ticket;
    @Autowired
    ResponseDto responseDto;
    @Autowired
    TicketDto ticketDto;

    public ResponseDto fetchTicketValidator(TicketDto ticketDto){
        Integer clientId = ticketDto.getClientId();
        Integer ticketCode = ticketDto.getTicketCode();
        Integer limit = ticketDto.getClientId();
        String status = ticketDto.getStatus();
        String title = ticketDto.getTitle();

        if( clientId == null){
            responseDto.setStatus("invalid");
        }
        else if( ticketCode == null && limit == null && status == null && title == null){
            responseDto.setStatus("all");
            responseDto.setObject(ticketDto);
        }
        else if( clientId != null && ticketCode != null && limit == null && status == null && title == null){
            responseDto.setMessage("single");
            responseDto.setObject(ticketDto);
        }
        else if(ticketCode == null){
            responseDto.setStatus("multiple");
            responseDto.setObject(ticketDto);
        }else{
            responseDto.setStatus("invalid");
        }
        return responseDto;
    }
}