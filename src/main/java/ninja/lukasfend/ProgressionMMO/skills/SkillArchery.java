package ninja.lukasfend.ProgressionMMO.skills;

import ninja.lukasfend.ProgressionMMO.enums.SkillType;
import ninja.lukasfend.ProgressionMMO.datahandlers.MMOPlayer;

public class SkillArchery extends Skill {

	@Override
	public SkillType getType() {
		return SkillType.ARCHERY;
	}

	@Override
	public void handleLevelup(MMOPlayer player, int level) {
		// TODO Auto-generated method stub

	}

}
