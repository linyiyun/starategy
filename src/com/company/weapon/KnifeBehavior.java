package com.company.weapon;

import com.company.weapon.WeaponBehavior;

public class KnifeBehavior implements WeaponBehavior {
	@Override
	public void useWeapon() {
		System.out.println("用匕首刺杀");
	}
}
