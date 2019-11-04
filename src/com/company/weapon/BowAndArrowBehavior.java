package com.company.weapon;

import com.company.weapon.WeaponBehavior;

public class BowAndArrowBehavior implements WeaponBehavior {
	@Override
	public void useWeapon() {
		System.out.println("用弓箭射杀");
	}
}
