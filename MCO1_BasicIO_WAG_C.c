#include <stdio.h>
#include <stdbool.h>
#include <string.h>

void clearInputBuffer();
void processMainMenu();
void processRegisterAccountName();
void processDepositAmount();
void processWithdrawAmount();
void processRecordExchangeRate();
void processCurrencyExchange();

int main (){

    processMainMenu();
    processRegisterAccountName();
    processDepositAmount();
    processWithdrawAmount();
    processRecordExchangeRate();
    processCurrencyExchange();

    return 0;
}


void clearInputBuffer(){
    int c;
    while ((c = getchar()) != '\n' && c != EOF);
}

void processMainMenu(){
    bool bPass = false;

    int nChoice;
    int nScanResult;

    do{
        printf("Select Transaction:\n");
        printf("[1] Register Account Name\n");
        printf("[2] Deposit Amount\n");
        printf("[3] Withdraw Amount\n");
        printf("[4] Currency Exchange\n");
        printf("[5] Record Exchange Rates\n");
        printf("[6] Show Interest Amount\n\n");

        printf("Choice: ");
        nScanResult = scanf("%d", &nChoice);
        clearInputBuffer();

        if (nScanResult == 1 && 1 <= nChoice && nChoice <= 6){
            printf("\n***\n");
            printf("Choice = %d\n\n", nChoice);
            bPass = true;
        }
        else{
            printf("ERROR: Please choose a valid input.\n");
        }
    }while(bPass == false);
}

void processRegisterAccountName(){
    bool bPass = false;

    char sLastNameInput[100];
    char sFirstNameInput[100];
    char sNameInput[100];

    bool bPassRegister = false;
    int i, j;
    int nCommaIndex;

    do{
        bPassRegister = false;

        printf("Register Account Name\n");

        printf("Account Name: ");
        fgets(sNameInput, sizeof(sNameInput), stdin);
        sNameInput[strcspn(sNameInput, "\n")] = '\0';

        for (i = 0; i < strlen(sNameInput); i++){
            if (sNameInput[i] == ','){
                bPassRegister = true;
            }
        }

        if (bPassRegister == true){
            i = 0;
            while(sNameInput[i] != ','){
                sLastNameInput[i] = sNameInput[i];
                i++;
            }
            nCommaIndex = i;
            sLastNameInput[i] = '\0';

            j = nCommaIndex + 1;
            while(sNameInput[j] == ' '){
                j++;
            }
            strcpy(sFirstNameInput, &sNameInput[j]);

            printf("\n***\n");
            printf("Account Name = %s, %s\n\n", sLastNameInput, sFirstNameInput);
            bPass = true;
        }
        else{
            printf("ERROR: Please choose a valid input.\n");
        }
    }while(bPass == false);
}

void processDepositAmount(){
    bool bPass = false;

    char sLastNameInput[100];
    char sFirstNameInput[100];
    char sNameInput[100];

    bool bPassRegister = false;
    int i, j;
    int nCommaIndex;
    int nScanResult;
    float fCurrentBalance = 1000.0;
    char sCurrency[4];
    float fDepositAmountInput;

    strcpy(sCurrency, "PHP");

    do{
        bPassRegister = false;

        printf("Deposit Amount\n");

        printf("Account Name: ");
        fgets(sNameInput, sizeof(sNameInput), stdin);
        sNameInput[strcspn(sNameInput, "\n")] = '\0';

        for (i = 0; i < strlen(sNameInput); i++){
            if (sNameInput[i] == ','){
                bPassRegister = true;
            }
        }

        if (bPassRegister == true){
            i = 0;
            while(sNameInput[i] != ','){
                sLastNameInput[i] = sNameInput[i];
                i++;
            }
            nCommaIndex = i;
            sLastNameInput[i] = '\0';

            j = nCommaIndex + 1;
            while(sNameInput[j] == ' '){
                j++;
            }
            strcpy(sFirstNameInput, &sNameInput[j]);

            printf("Current Balance: %.2f\n", fCurrentBalance);
            printf("Currency: %s\n\n", sCurrency);

            printf("Deposit Amount: ");
            nScanResult = scanf("%f", &fDepositAmountInput);
            clearInputBuffer();

            if (nScanResult == 1 && fDepositAmountInput >= 0){
                printf("\n***\n");
                printf("Account Name = %s, %s\n", sLastNameInput, sFirstNameInput);
                printf("Deposit Amount = %.2f\n\n", fDepositAmountInput);
                bPass = true;
            }
            else{
                printf("ERROR: Please choose a valid input.\n");
            }
        }
        else{
            printf("ERROR: Please choose a valid input.\n");
        }
    }while(bPass == false);
}

void processWithdrawAmount(){
    bool bPass = false;

    char sLastNameInput[100];
    char sFirstNameInput[100];
    char sNameInput[100];

    bool bPassRegister = false;
    int i, j;
    int nCommaIndex;
    int nScanResult;
    float fCurrentBalance = 1000.0;
    char sCurrency[4];
    float fWithdrawAmountInput;

    strcpy(sCurrency, "PHP");

    do{
        bPassRegister = false;

        printf("Withdraw Amount\n");

        printf("Account Name: ");
        fgets(sNameInput, sizeof(sNameInput), stdin);
        sNameInput[strcspn(sNameInput, "\n")] = '\0';

        for (i = 0; i < strlen(sNameInput); i++){
            if (sNameInput[i] == ','){
                bPassRegister = true;
            }
        }

        if (bPassRegister == true){
            i = 0;
            while(sNameInput[i] != ','){
                sLastNameInput[i] = sNameInput[i];
                i++;
            }
            nCommaIndex = i;
            sLastNameInput[i] = '\0';

            j = nCommaIndex + 1;
            while(sNameInput[j] == ' '){
                j++;
            }
            strcpy(sFirstNameInput, &sNameInput[j]);

            printf("Current Balance: %.2f\n", fCurrentBalance);
            printf("Currency: %s\n\n", sCurrency);

            printf("Withdraw Amount: ");
            nScanResult = scanf("%f", &fWithdrawAmountInput);
            clearInputBuffer();

            if (nScanResult == 1 && fWithdrawAmountInput >= 0){
                printf("\n***\n");
                printf("Account Name = %s, %s\n", sLastNameInput, sFirstNameInput);
                printf("Withdraw Amount = %.2f\n\n", fWithdrawAmountInput);
                bPass = true;
            }
            else{
                printf("ERROR: Please choose a valid input.\n");
            }
        }
        else{
            printf("ERROR: Please choose a valid input.\n");
        }
    }while(bPass == false);
}

void processRecordExchangeRate(){
    bool bPass = false;

    int nSelectForeignCurrency;
    float fExchangeRate;
    int nScanChoice;
    int nScanRate;

    do{
        printf("Record Exchange Rate\n\n");
        printf("[1] Philippine Peso (PHP)\n");
        printf("[2] United States Dollar (USD)\n");
        printf("[3] Japanese Yen (JPY)\n");
        printf("[4] British Pound Sterling (GBP)\n");
        printf("[5] Euro (EUR)\n");
        printf("[6] Chinese Yuan Renminni (CNY)\n\n");

        printf("Select Foreign Currency: ");
        nScanChoice = scanf("%d", &nSelectForeignCurrency);

        if (nScanChoice == 1 && 1 <= nSelectForeignCurrency && nSelectForeignCurrency <= 6){
            printf("Exchange Rate: ");
            nScanRate = scanf("%f", &fExchangeRate);

            if (nScanRate == 1 && fExchangeRate >= 0){
                printf("\n***\n");
                printf("Select Foreign Currency = [%d]\n", nSelectForeignCurrency);
                printf("Exchange Rate = %.2f\n\n", fExchangeRate);
                bPass = true;
            }
            else{
                printf("ERROR: Please choose a valid input.\n");
            }
        }
        else{
            printf("ERROR: Please choose a valid input.\n");
        }
        clearInputBuffer();
    }while(bPass == false);
}

void processCurrencyExchange(){
    bool bPass = false;

    float fSourceAmountInput;
    int nScanResult;

    float fRateUSD = 62.00;
    float fRateJPY = 0.40;
    float fRateGBP = 84.00;
    float fRateEUR = 72.00;
    float fRateCNY = 9.00;

    do{
        printf("Foreign Currency Exchange\n");
        printf("Source Amount (PHP): ");
        nScanResult = scanf("%f", &fSourceAmountInput);
        clearInputBuffer();

        if (nScanResult == 1 && fSourceAmountInput >= 0){
            printf("\nExchanged Currency\n");
            printf("[1] Philippine Peso (PHP) = %.2f\n", fSourceAmountInput);
            printf("[2] United States Dollar (USD) = %.2f\n", fSourceAmountInput * fRateUSD);
            printf("[3] Japanese Yen (JPY) = %.2f\n", fSourceAmountInput * fRateJPY);
            printf("[4] British Pound Sterling (GBP) = %.2f\n", fSourceAmountInput * fRateGBP);
            printf("[5] Euro (EUR) = %.2f\n", fSourceAmountInput * fRateEUR);
            printf("[6] Chinese Yuan Renminni (CNY) = %.2f\n", fSourceAmountInput * fRateCNY);

            printf("\n***\n");
            printf("Source Currency = Philippine Peso (PHP)\n");
            printf("Source Amount (PHP) = %.2f\n", fSourceAmountInput);
            bPass = true;
        }
        else{
            printf("ERROR: Please choose a valid input.\n");
        }
    }while(bPass == false);
}
