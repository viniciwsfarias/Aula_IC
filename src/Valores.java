public class Valores implements ValoresITF {
	
	int valores[] = new int[9];

	@Override
	public boolean ins(int v) {
		
		boolean addvalue = false;
			for(int i = 0; i < valores.length; i++) {
				if(valores[i] == 0 && v > 0) {
					valores[i] = v;
					addvalue = true;
						break;
			}
		}
			
		return addvalue;
		
		
		
	}

	@Override
	public int del(int y) {
	int retorno = -1; //subtrai de valores 
	int x = 0;
		if(y >= 0 && y < 10) { //valor menor que o tamanho do array
			if(valores[y] > 0 ) {
				retorno = valores[y]; //valor = -1
				valores[y] = 0; //zera o indice
					int newvalue[] = new int[10]; //declara o array
						for (int i = 0; i < this.valores.length; i++) {
							if (this.valores[i] > 0) {
								newvalue[x] = this.valores[i];
								x++;
								
				}
			}
		}
	}
	return x;
	}

	@Override
	public int size() {
		
		
		int count = 0;
		
		for(int i = 0; i <= this.valores.length; i++) {
			if(valores[i] > 0) {
				count++;
				
			}
		}
		return count;
		
	}


	@Override
	public double mean() {
		// TODO Auto-generated method stub
		
		int cont = 0, soma = 0;
		
		for(int i = 0; i <= valores.length; i++) {
			if (valores[i] >= 1) {
				soma = valores[i] + soma;
				cont++;
				System.out.println("a média é " + soma / cont);
			}
		}
		return 0;
	}

	@Override
	public int greater() {
		// TODO Auto-generated method stub
		int max = 0;
		for(int i = 0; i <= valores.length; i++) {
			if (valores[i] > max) {
				max = valores[i];
			}
			
		}
		
		return 0;
	}

	@Override
	public int lower() {
		// TODO Auto-generated method stub
		
		int min = 0;
		for(int i = 0; i <= valores.length; i++) {
			if (valores[i] < min) {
				min = valores[i];
			}
			
		}
		return 0;
	}

}
