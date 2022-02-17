import com.zookeeper.Bat;
import com.zookeeper.Gorilla;

public class ZooKeeperTest {

	public static void main(String[] args) {
//		ZookKeeper Assignment Part 1
		Gorilla gorilla = new Gorilla(100);
		gorilla.throwSomething();
		gorilla.displayEnergy();
		gorilla.throwSomething();
		gorilla.displayEnergy();
		gorilla.throwSomething();
		gorilla.displayEnergy();
		gorilla.eatBananas();
		gorilla.displayEnergy();
		gorilla.eatBananas();
		gorilla.displayEnergy();
		gorilla.climb();
		gorilla.displayEnergy();
		
//		ZooKeeper Assignment Part 2
		Bat bat = new Bat();
		bat.attackTown();
		bat.displayEnergy();
		bat.attackTown();
		bat.displayEnergy();
		bat.attackTown();
		bat.displayEnergy();
		bat.eatHumans();
		bat.displayEnergy();
		bat.eatHumans();
		bat.displayEnergy();
		bat.fly();
		bat.displayEnergy();
		bat.fly();
		bat.displayEnergy();
	}
}
