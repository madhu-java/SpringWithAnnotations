package org.madhu.SpringAnnotationEx;

import org.springframework.beans.factory.annotation.Autowired;

public class Samsung {
	@Autowired
	MobileProcessor cpu;
	public void config() {
		System.out.println("Octa Core,4 gb Ram, 12MP camera");
		cpu.process();
	}
	public MobileProcessor getCpu() {
		return cpu;
	}
	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}
	

}
