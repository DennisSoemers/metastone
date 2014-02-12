package net.pferdimanzug.hearthstone.analyzer.game.cards.concrete.mage;

import net.pferdimanzug.hearthstone.analyzer.game.cards.MinionCard;
import net.pferdimanzug.hearthstone.analyzer.game.cards.Rarity;
import net.pferdimanzug.hearthstone.analyzer.game.entities.heroes.HeroClass;
import net.pferdimanzug.hearthstone.analyzer.game.entities.minions.Minion;
import net.pferdimanzug.hearthstone.analyzer.game.spells.BuffSpell;
import net.pferdimanzug.hearthstone.analyzer.game.spells.trigger.SpellCastedTrigger;
import net.pferdimanzug.hearthstone.analyzer.game.spells.trigger.SpellTrigger;

public class ManaWyrm extends MinionCard {

	public ManaWyrm() {
		super("Mana Wyrm", 1, 3, Rarity.COMMON, HeroClass.MAGE, 1);
		setDescription("Whenever you cast a spell, gain +1 Attack.");
	}

	@Override
	public Minion summon() {
		Minion manaWyrm = createMinion();
		SpellTrigger trigger = new SpellTrigger(new SpellCastedTrigger(), new BuffSpell(1));
		manaWyrm.setSpellTrigger(trigger);
		return manaWyrm;
	}

}