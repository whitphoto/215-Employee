
public class PieceWorker extends Employee {

	private double wage;
	private double pieces;

	public PieceWorker( String first, String last, String ssn, int dobMonth, int dobDay,int dobYear, double wage, double pieces)
		{
			super( first, last, ssn, dobMonth, dobDay, dobYear );
			setWage(wage);
			setPieces(pieces);
			
		}
	
	public void setWage(double piecewage)
		{
			this.wage = piecewage;
			
		}// end setWaGE
		
	public void setPieces(double pieceCount)
		
		{
			this.pieces = pieceCount;
		}//end SetPieces
		
	public double getWage()
		{
			return this.wage;
			
		}
	
	public double getPieces()
		{
			return this.pieces;
		}
		
	public double earnings()
		{
			double pay;
			pay = getPieces() * getWage();
			return pay;
		}
	
	@Override 
	public String toString()
		{
			return String.format("Piece Worker: " + super.toString() + " Weekly pay " + earnings());
		}
}//end class PieceWorker
