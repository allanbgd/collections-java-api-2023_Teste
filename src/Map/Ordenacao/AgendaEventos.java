package Map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import Map.OperacoesBasicas.AgendaContatos;

public class AgendaEventos {

	private Map<LocalDate, Evento> eventosMap;

	public AgendaEventos() {
	
		this.eventosMap = new HashMap<>();
	}
	
	
	public void adicionarEventos(LocalDate data, String nome, String atracao) {
	
		
		eventosMap.put(data, new Evento(nome, atracao));
		
		
		
	} 
	public void exibirAgenda() {
		//organiza em ordem crescente e depois chama
		Map<LocalDate, Evento>	eventosTreeMap = new TreeMap<>(eventosMap);	
		System.out.println(eventosTreeMap);
	}
	
	public void obterProximoEvento() {
		// não pode ser usado poque tá juntando coisas diferentes Map e set
		//Set<LocalDate> dateSet = eventosMap.keySet();
		//Collection<Evento>values = eventosMap.values();]
		
		//eventosMap.get();
		
		
		//método de definir a data de hoje
		LocalDate dataAtual = LocalDate.now();
		LocalDate proximaData = null;
		Evento proximoEvento= null;
		// organiza em ordem crescente
		Map<LocalDate, Evento>	eventosTreeMap = new TreeMap<>(eventosMap);	
		
		for(Map.Entry<LocalDate, Evento> entry :eventosTreeMap.entrySet()) {
			//uma chave e um valor interligados
			
			if(entry.getKey().isEqual(dataAtual)|| entry.getKey().isAfter(dataAtual)) {
				proximaData = entry.getKey();
				proximoEvento = entry.getValue();
				
				System.out.println("O proximo evento " +proximoEvento+" acontecerá na data " + proximaData);
				break;
				
				
				
			}
		} 
	}
	
	
	public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        
        agendaEventos.adicionarEventos(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atracação 1 ");
        agendaEventos.adicionarEventos(LocalDate.of(2022, 7, 15), "Evento 2", "Atracação 2 ");
        agendaEventos.adicionarEventos(LocalDate.of(2022, 7, 15), "Evento 2", "Atracação 2 ");
        
        
        agendaEventos.exibirAgenda();
    }
	
}
