package ru.demo.bankrupts;

import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import ru.demo.bankrupts.soap.ws.client.generated.DebtorRegisterItem;
import ru.demo.bankrupts.soap.ws.client.generated.IMessageService;
import ru.demo.bankrupts.soap.ws.client.generated.MessageService;

public class BankruptsServiceClient {

	private static final String HTTPS_SERVICE_FEDRESURS_RU = "https://services.fedresurs.ru/Bankruptcy/MessageServiceDemo/WebService.svc";

	public static void main(String[] args) throws Exception {
		// demowebuser:Ax!761BN@
		URL url = new URL(HTTPS_SERVICE_FEDRESURS_RU);

		MessageService messageService = new MessageService(url);
		IMessageService messageServiceProxy = messageService.getBasicHttpBindingIMessageService();

		BindingProvider prov = (BindingProvider) messageServiceProxy;
		prov.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, HTTPS_SERVICE_FEDRESURS_RU);
		Map<String, List<String>> headers = new HashMap<String, List<String>>();
		prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "demowebuser");
		prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "Ax!761BN@");
		prov.getRequestContext().put(MessageContext.HTTP_REQUEST_HEADERS, headers);

		DebtorRegisterItem debtor = messageServiceProxy.getDebtorByIdBankrupt(138895);

		System.out.println("DebtorRegisterItem [lastMessageDate=" + debtor.getLastMessageDate() + ", lastReportDate=" + debtor.getLastReportDate()
		+ ", legalCaseList=" + debtor.getLegalCaseList() + ", category=" + debtor.getCategory() + ", categoryCode=" + debtor.getCategoryCode()
		+ ", region=" + debtor.getRegion() + ", dateLastModif=" + debtor.getDateLastModif() + ", inn=" + debtor.getINN() + ", bankruptId="
		+ debtor.getBankruptId() + ", guid=" + debtor.getGuid() + "]");
	}

}
