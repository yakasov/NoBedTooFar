package com.yakasov.mixin;

import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(ServerPlayerEntity.class)
abstract class NoBedTooFarMixin {
	@Redirect(
			method = "isBedWithinRange*",
			at = @At(
					value = "INVOKE",
					target = "Lnet/minecraft/server/network/ServerPlayerEntity;isBedWithinRange(Lnet/minecraft/util/math/BlockPos;)Z"
			)
	)
	private boolean redirectWithPos(ServerPlayerEntity instance, BlockPos pos) {
		return true;
	}
}