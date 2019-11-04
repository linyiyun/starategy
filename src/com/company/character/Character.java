package com.company.character;

import com.company.weapon.WeaponBehavior;

/**
 * 角色，每个角色有一个 武器
 */
public abstract class Character {

	protected WeaponBehavior weaponBehavior;

	public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
		this.weaponBehavior = weaponBehavior;
	}
	public  void fight(){
		System.out.print("我是" + this.getClass().getSimpleName());
		weaponBehavior.useWeapon();
	}
}
