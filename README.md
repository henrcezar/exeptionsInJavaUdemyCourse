No método Muito Ruim há um problema grave de delegação, onde a tratativa das exceções é feita no código da aplicação principal. Código ficou sujo e com muitos if-else.
Na solução ruim, a lógica de validação é colocada na Classe Reservation, o que também não é correto, pois está dentro de um método.
Por fim, a versão correta, com o erro sendo tratado através da criação de uma classe específica.
