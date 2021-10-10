package br.com.musication.domain.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author macrusal on 10/10/21
 * @project musication
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse implements Serializable {

        private static final long serialVersionUID = 1L;

        private Integer status;
        private String mensagem;
        private Long timeStamp;
}
