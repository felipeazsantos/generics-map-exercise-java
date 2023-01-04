package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import entities.Candidate;

public class Program {

	public static void main(String[] args) {
		
		String path = "/home/felipe/eclipse-workspace/genericsmapexercise/in";
		Map<Candidate, Integer> candidates = new TreeMap<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
		
			
			String line = br.readLine();
			int key = 1;
			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				int votes = Integer.parseInt(fields[1]);
				
				Candidate candidate = new Candidate(key, name);
				
				if (candidates.containsKey(candidate)) {
					votes = votes + candidates.get(candidate);
				}	
				
				candidates.put(candidate, votes);
				

				line = br.readLine();
				
			}
			
			for (Candidate candidate : candidates.keySet()) {
				System.out.println(candidate.getName() + ": " + candidates.get(candidate));
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
