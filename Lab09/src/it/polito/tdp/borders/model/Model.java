package it.polito.tdp.borders.model;

import java.util.*;

import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.alg.ConnectivityInspector;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;

import it.polito.tdp.borders.db.BordersDAO;

public class Model {

	private Graph<Country,DefaultEdge> graph;
	private List<Country> countries;
	private BordersDAO dao;
   
	
	public Model() {
		this.dao=new BordersDAO();
		this.graph = new SimpleGraph<>(DefaultEdge.class);
		this.countries=new ArrayList<Country>(dao.loadAllCountries());

	}

	public void creaGrafo(int anno) {
		Graphs.addAllVertices(this.graph,this.countries);
		this.aggiungiEdge(anno);
	}

	private void aggiungiEdge(int anno) {
     List<Border> borders = new ArrayList<>(dao.getCountryPairs(anno));
    for(Border b : borders) {
    	graph.addEdge(this.getCountryFromId(b.getCc1()), this.getCountryFromId(b.getCc2()));
    }
     
	}
	
	
	public Country getCountryFromId(int id) {
		for(Country c:countries) {
			if(c.getCCode()==id) {
				return c;
			}
		}
		return null;
	}

	

	public Graph<Country, DefaultEdge> getGraph() {
		return graph;
	}
	public int getDegree(Country c) {
		return graph.degreeOf(c);
	}
	
	
	public String getListaConnessi(){
		StringBuilder sb= new StringBuilder();
		for(Country c : graph.vertexSet()) {
			sb.append(c.getStateName()+" "+this.getDegree(c)+"\n");
		}
		return sb.toString();
		
	}
	
	public int numeroGrafi() {
		ConnectivityInspector ci = new ConnectivityInspector(graph);
		
		return ci.connectedSets().size();
	}
}
