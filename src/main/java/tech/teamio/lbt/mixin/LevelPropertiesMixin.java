package tech.teamio.lbt.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.world.World;
import net.minecraft.world.level.LevelProperties;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import tech.teamio.lbt.TimeUtil;

@Mixin(LevelProperties.class)
public class LevelPropertiesMixin {
	@Inject(at = @At("RETURN"), method = "getTimeOfDay()J", cancellable = true)
	private void tick(CallbackInfoReturnable<Long> info) {
		info.setReturnValue(TimeUtil.calTime());
	}
}
