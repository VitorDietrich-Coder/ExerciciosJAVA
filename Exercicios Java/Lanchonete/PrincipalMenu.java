package br.fag.edu.br.Lanchonete;

import java.util.ArrayList;
import java.util.Scanner;

public class PrincipalMenu
{
	private static Scanner scanner = new Scanner(System.in);
	private static ArrayList<Produtos> Produtospedidos = new ArrayList<Produtos>();
	private static double valorFinal;
	private static Pedido pedido = new Pedido();

	public static void main(String args[])
	{
		menu();

		Salgadinhos salgadinho = new Salgadinhos();
		salgadinho.setDataValidade("20/08/2022");
		salgadinho.setPeso("60g");
		salgadinho.setPrecoVenda(2.0);
	}

	private static void menu()
	{
		Scanner scannerMenu = new Scanner(System.in);
		boolean escolheusairmenuprincipal = false;
		while (!escolheusairmenuprincipal)
		{
			System.out.println("Selecione a operação na qual deseja realizar: ");
			System.out.println("1-Pedido\n2-Emitir Cupom Fiscal\n3-Alterar produtos\n4-Sair");
			String Opcoes = scannerMenu.nextLine();
			switch (Opcoes)
			{
				case "1":
					Scanner scanner2 = new Scanner(System.in);
					System.out.println("Digite seu nome:");
					String NomeCliente = scanner2.nextLine();

					boolean adicionarMaisProdutos = false;
					while (!adicionarMaisProdutos)
					{
						System.out.println("Selecione o produto do pedido: ");
						System.out.println("1-Pizza\n2-Lanche\n3-Salgadinho");
						String Produto = scanner2.nextLine();
						switch (Produto)
						{
							case "1":
								Pizzas pizza = new Pizzas();
								pizza.setPrecoVenda(40.0);
								double valorPizza = pizza.getPrecoVenda();
								System.out.println(
										"Deseja inserir borda recheada? digite 1 para sim ou pressione qualquer tecla:");
								String bordasimounao = scanner2.nextLine();
								if (bordasimounao.equals("1"))
								{
									boolean validaborda = true;
									while (validaborda)
									{
										System.out.println("Selecione uma borda abaixo digitando o nome da mesma:");
										System.out.println("catupiry - $2,00 \ncheddar - $3,50 \nchocolate - $4,50");
										String borda = scanner2.nextLine();

										if (borda.equals(EBordasPizza.catupiry.toString()))
										{
											valorPizza += EBordasPizza.catupiry.getValor();
											pizza.setBordas(borda);
											validaborda = false;
										}
										else if (borda.equals(EBordasPizza.cheddar.toString()))
										{
											valorPizza += EBordasPizza.cheddar.getValor();
											pizza.setBordas(borda);
											validaborda = false;
										} 
										else if (borda.equals(EBordasPizza.chocolate.toString()))
										{
											valorPizza += EBordasPizza.chocolate.getValor();
											pizza.setBordas(borda);
											validaborda = false;
										} 
										else
										{
											System.out.println("valor inválido");
										}
									}
								}
								boolean validamolhos = true;
								while (validamolhos)
								{
									System.out.println("Selecione um molho digitando o nome do mesmo:");
									System.out.println("tomate\nbranco\nmolhocompimenta");
									String molhos = scanner2.nextLine();

									if (molhos.equals(EMolhos.branco.toString()))
									{
										pizza.setMolhos(EMolhos.branco.getDescricao());
										validamolhos = false;
									} else if (molhos.equals(EMolhos.tomate.toString()))
									{
										pizza.setMolhos(EMolhos.tomate.getDescricao());
										validamolhos = false;
									} else if (molhos.equals(EMolhos.molhocompimenta.toString()))
									{
										pizza.setMolhos(EMolhos.molhocompimenta.getDescricao());
										validamolhos = false;
									} else
									{
										System.out.println("molho inválido");
									}
								}
								boolean validarecheio = true;
								while (validarecheio)
								{
									System.out.println("Selecione um recheio digitando o nome do mesmo:");
									System.out.println(
											"frango - $2,00 \ncalabresa - $3,50\nqueijo - $4,50\nstrognoffCarne - $4,00");
									String recheio = scanner2.nextLine();

									if (recheio.equals(ERecheios.calabresa.toString()))
									{
										valorPizza += ERecheios.calabresa.getValor();
										pizza.setRecheio(recheio);
										validarecheio = false;
									} else if (recheio.equals(ERecheios.strogonoffCarne.toString()))
									{
										valorPizza += ERecheios.strogonoffCarne.getValor();
										pizza.setRecheio(recheio);
										validarecheio = false;
									} else if (recheio.equals(ERecheios.queijo.toString()))
									{
										valorPizza += ERecheios.queijo.getValor();
										pizza.setRecheio(recheio);
										validarecheio = false;
									} else if (recheio.equals(ERecheios.frango.toString()))
									{
										valorPizza += ERecheios.frango.getValor();
										pizza.setRecheio(recheio);
										validarecheio = false;
									} else
									{
										System.out.println("recheio inválido");
										validarecheio = true;
									}
								}
								pizza.setDataValidade("20/10/2022");
								pizza.setPeso("900g");
								pizza.setPrecoVenda(valorPizza);

								Produtospedidos.add(pizza);

								System.out.println(
										"Deseja adicionar mais produtos? se sim tecle 1, caso contrário tecle 2");
								int recebe2 = scanner.nextInt();
								if (recebe2 == 1)
								{
									adicionarMaisProdutos = false;
								} else
								{
									escolheusairmenuprincipal = false;
									adicionarMaisProdutos = true;
								}

								pedido.setNomeCliente(NomeCliente);
								pedido.setItensConsumidos(Produtospedidos);
								escolheusairmenuprincipal = false;
								break;

							case "2":
								Lanches lanches = new Lanches();
								lanches.setPrecoVenda(20.0);
								double valorLanches = lanches.getPrecoVenda();
								boolean validarecheioLanche = true;
								while (validarecheioLanche)
								{
									System.out.println("Selecione um recheio para o lanche:");
									System.out.println("frango-$2,00 \ncalabresa-$3,50\nhamburguer-$4,00");
									valorFinal += lanches.getPrecoVenda();
									String recheioLanches = scanner2.nextLine();

									if (recheioLanches.equals(ERecheios.calabresa.toString()))
									{
										lanches.setRecheio(recheioLanches);
										valorLanches += ERecheios.calabresa.getValor();
										validarecheioLanche = false;
									} else if (recheioLanches.equals(ERecheios.frango.toString()))
									{
										lanches.setRecheio(recheioLanches);
										valorLanches += ERecheios.frango.getValor();
										validarecheioLanche = false;
									} else if (recheioLanches.equals(ERecheios.hamburguer.toString()))
									{
										lanches.setRecheio(recheioLanches);
										valorLanches += ERecheios.hamburguer.getValor();
										validarecheioLanche = false;
									} else
									{
										System.out.println("Valor digitado inválido");
									}
								}
								boolean validamolhosLanches = true;
								while (validamolhosLanches)
								{
									System.out.println("Selecione um molho para o lanche:");
									System.out.println("branco\nmolhocompimenta\nmolhodacasa");
									String molhosLanches = scanner2.nextLine();

									if (molhosLanches.equals(EMolhos.branco.toString()))
									{
										lanches.setMolhos(EMolhos.branco.getDescricao());
										validamolhosLanches = false;
									} else if (molhosLanches.equals(EMolhos.molhocompimenta.toString()))
									{
										lanches.setMolhos(EMolhos.molhocompimenta.getDescricao());
										validamolhosLanches = false;
									} else if (molhosLanches.equals(EMolhos.molhodacasa.toString()))
									{
										lanches.setMolhos(EMolhos.molhodacasa.getDescricao());
										validamolhosLanches = false;
									} else
									{
										System.out.println("molho selecionado é inválido");
									}
								}

								boolean validaPao = true;
								while (validaPao)
								{
									System.out.println("Selecione um tipo de Pão para o lanche:");
									System.out.println("frances\nBengala");
									String tipoPao = scanner2.nextLine();

									if (tipoPao.equals(ETipoPao.frances.toString()))
									{
										lanches.setTipoPao(ETipoPao.frances.getDescricao());
										validaPao = false;
									} else if (tipoPao.equals(ETipoPao.bengala.toString()))
									{
										lanches.setTipoPao(ETipoPao.bengala.getDescricao());
										validaPao = false;
									} else
									{
										System.out.println("Pão selecionado é inválido");
									}

								}
								lanches.setDataValidade("20/09/2022");
								lanches.setPeso("500g");
								lanches.setPrecoVenda(valorLanches);
								Produtospedidos.add(lanches);

								System.out.println(
										"Deseja adicionar mais produtos? se sim tecle 1, caso contrário tecle 2");

								int recebe3 = scanner2.nextInt();
								if (recebe3 == 1)
								{
									adicionarMaisProdutos = false;
								} else
								{
									escolheusairmenuprincipal = false;
									adicionarMaisProdutos = true;
								}

								pedido.setNomeCliente(NomeCliente);
								pedido.setItensConsumidos(Produtospedidos);
								escolheusairmenuprincipal = false;
								break;

							case "3":
								Salgadinhos salgadinhos = new Salgadinhos();
								salgadinhos.setPrecoVenda(5.0);
								double valorSalgadinhos = salgadinhos.getPrecoVenda();
								boolean validatipo = true;
								while (validatipo)
								{
									System.out.println("Selecione um tipo:");
									System.out.println("frita\nassada");
									String tipo = scanner2.nextLine();

									if (tipo.equals(ETipos.assada.toString()))
									{
										salgadinhos.setTipo(ETipos.assada.getDescricao());
										validatipo = false;
									} else if (tipo.equals(ETipos.frita.toString()))
									{
										salgadinhos.setTipo(ETipos.frita.getDescricao());
										validatipo = false;

									} else
									{
										System.out.println("tipo do salgado inválido, digite novamente:");
									}
								}

								boolean validamassa = true;
								while (validamassa)
								{
									System.out.println("Selecione uma masssa:");
									System.out.println("MassaSalgada\nMassaFolhada");
									String Massa = scanner2.nextLine();

									if (Massa.equals(EMassas.MassaSalgada.toString()))
									{
										salgadinhos.setMassa(EMassas.MassaSalgada.getDescricao());
										validamassa = false;
									} else if (Massa.equals(EMassas.MassaFolhada.toString()))
									{
										salgadinhos.setMassa(EMassas.MassaFolhada.getDescricao());
										validamassa = false;
									} else
									{
										System.out.println("masssa selecionada inválida, digite novamente:");
									}
								}

								boolean validarecheioSalgado = true;
								while (validarecheioSalgado)
								{
									System.out.println("Selecione um recheio para o salgado:");
									System.out.println("frango-$2,00\npizza-$2,00\ncarne-$4,00");
									String recheioSalgado = scanner2.nextLine();

									if (recheioSalgado.equals(ERecheios.frango.toString()))
									{
										salgadinhos.setRecheio(recheioSalgado);
										valorSalgadinhos += ERecheios.frango.getValor();
										validarecheioSalgado = false;

									} else if (recheioSalgado.equals(ERecheios.pizza.toString()))
									{
										salgadinhos.setRecheio(recheioSalgado);
										valorSalgadinhos += ERecheios.pizza.getValor();
										validarecheioSalgado = false;
									} else if (recheioSalgado.equals(ERecheios.carne.toString()))
									{
										salgadinhos.setRecheio(recheioSalgado);
										valorSalgadinhos += ERecheios.carne.getValor();
										validarecheioSalgado = false;
									} else
									{
										System.out.println("Valor digitado inválido");
									}
								}
								salgadinhos.setDataValidade("20/10/2022");
								salgadinhos.setPeso("40g");
								salgadinhos.setPrecoVenda(valorSalgadinhos);

								Produtospedidos.add(salgadinhos);

								System.out.println(
										"Deseja adicionar mais produtos? se sim tecle 1, caso contrário tecle 2");
								int recebe4 = scanner2.nextInt();
								if (recebe4 == 1)
								{
									adicionarMaisProdutos = false;
								} else
								{
									escolheusairmenuprincipal = false;
									adicionarMaisProdutos = true;
								}

								pedido.setNomeCliente(NomeCliente);
								pedido.setItensConsumidos(Produtospedidos);
								escolheusairmenuprincipal = false;
								break;

							default:
								System.out.println("Valor Inválido");
								escolheusairmenuprincipal = false;
								adicionarMaisProdutos = false;
								break;
						}
					}
					pedido.CriarPedido();
					break;

				case "2":
				{
					Scanner scanner5 = new Scanner(System.in);
					if (Produtospedidos.size() > 0)
					{
						System.out.println("Imprimir recibo");
						System.out.println("Digite o valor recebido");
						double valorTotal = 0.0;
						boolean validarecibo = true;
						while (validarecibo)
						{
							String valorRecebido = scanner5.next();
							double valorRecebidoT = 0.0;
							if (valorRecebido.matches("^[0-9]+$"))
							{
								valorRecebidoT = Double.parseDouble(valorRecebido);
								validarecibo = false;
								for (Produtos produtofor : Produtospedidos)
								{
									valorTotal += produtofor.getPrecoVenda();
								}
								CupomFiscal cupomfiscal = new CupomFiscal(valorRecebidoT, valorTotal);
								cupomfiscal.ImprimirRecibo();
							} else
							{
								System.out.println("Valor Inválido, digite um valor correto");
								escolheusairmenuprincipal = false;
								break;
							}
						}
					} else
					{
						System.out.println("Crie um pedido para emitir um cupom");
						escolheusairmenuprincipal = false;
						break;
					}
					escolheusairmenuprincipal = false;
					break;
				}
				case "3":
				{
					Pizzas pizza = new Pizzas();
					Lanches lanche = new Lanches();
					Salgadinhos salgadinhos = new Salgadinhos();
					System.out.println("Alterando Produtos...");
					System.out.println("Selecione um produto que deseja altera o preço:");
					System.out.println("Selecione a operação na qual deseja realizar: ");
					System.out.println("1-Pizza\n2-Lanche\n3-Salgadinho\n4-AlterarTaxaServico");
					String recebeProduto = scannerMenu.nextLine();

					switch (recebeProduto)
					{
						case "1":
						{
							pizza.AlteraValorProduto();
							escolheusairmenuprincipal = true;
							break;
						}
						case "2":
						{
							lanche.AlteraValorProduto();
							escolheusairmenuprincipal = true;
							break;
						}
						case "3":
						{
							salgadinhos.AlteraValorProduto();
							break;
						}
						case "4":
						{
							boolean validataxaServico = true;
							while (validataxaServico)
							{
								System.out.println("Digite o valor da pizza:");
								String ValorServico = scanner.next();

								double ValorServicoT = 0.0;
								if (ValorServico.matches("^[0-9]+$"))
								{
									ValorServicoT = Double.parseDouble(ValorServico);
									pedido.setTaxaServico(ValorServicoT);
									validataxaServico = false;
								} else
								{
									System.out.println("Valor Inválido, digite um valor correto");
									escolheusairmenuprincipal = false;
								}
							}
							escolheusairmenuprincipal = true;
							break;
						}
						default:
							System.out.println("Digite um valor válido:");
					}

					escolheusairmenuprincipal = false;
					break;
				}
				case "4":
					
					escolheusairmenuprincipal = true;
					break;
				default:
					System.out.println("Digite um valor valido;");
					break;
			}
		}
	}
}