package org.sid.bank_account_service.mappers;

import org.sid.bank_account_service.dto.BankAccountRequestDTO;
import org.sid.bank_account_service.dto.BankAccountResponseDTO;
import org.sid.bank_account_service.entities.BankAccount;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {
    public BankAccountResponseDTO fromBankAccount(BankAccount bankAccount) {
        BankAccountResponseDTO responseDTO = new BankAccountResponseDTO();
        BeanUtils.copyProperties(bankAccount, responseDTO);
        return responseDTO;
    }

    public BankAccount fromRequestDTO(BankAccountRequestDTO requestDTO) {
        BankAccount bankAccount = new BankAccount();
        BeanUtils.copyProperties(requestDTO, bankAccount);
        return bankAccount;
    }
}