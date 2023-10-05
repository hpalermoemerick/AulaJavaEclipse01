package sequencia;

public class ProgressaoGeometrica implements IProgressaoGeometrica {

	private int vi, rz;
	private int vc;
	
	public ProgressaoGeometrica() {
		vi = 1;
		rz = 2;
		vc = vi;
	}
	
	@Override
	public int primeiro() {
		return 0;
	}

	@Override
	public int proximo() {
		return 0;
	}

	@Override
	public int getVi() {
		return this.vi;
	}

	@Override
	public void setVi(int vi) {
		this.vi = vi;
	}

	@Override
	public int getRz() {
		return this.rz;
	}

	@Override
	public void setRz(int rz) {
		this.rz = rz;
	}

}
