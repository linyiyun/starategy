package com.company.weapon;

import com.company.weapon.WeaponBehavior;

public class SwordBehavior implements WeaponBehavior {
	@Override
	public void useWeapon() {
		System.out.println("挥舞宝剑");
	}
}
