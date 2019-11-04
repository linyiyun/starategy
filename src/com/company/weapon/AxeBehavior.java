package com.company.weapon;

import com.company.weapon.WeaponBehavior;

public class AxeBehavior implements WeaponBehavior {
	@Override
	public void useWeapon() {
		System.out.println("用斧头劈砍");
	}
}
