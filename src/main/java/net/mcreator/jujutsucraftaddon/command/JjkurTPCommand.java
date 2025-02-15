package net.mcreator.jujutsucraftaddon.command;

import com.mojang.brigadier.arguments.DoubleArgumentType;
import net.mcreator.jujutsucraftaddon.procedures.TPLocationProcedure;
import net.mcreator.jujutsucraftaddon.procedures.TPPlayerProcedure;
import net.minecraft.commands.Commands;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.util.FakePlayerFactory;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class JjkurTPCommand {
    @SubscribeEvent
    public static void registerCommand(RegisterCommandsEvent event) {
        event.getDispatcher().register(Commands.literal("jjkuTP")

                .then(Commands.literal("Location")
                        .then(Commands.argument("X", DoubleArgumentType.doubleArg()).then(Commands.argument("Y", DoubleArgumentType.doubleArg()).then(Commands.argument("Z", DoubleArgumentType.doubleArg()).executes(arguments -> {
                            Level world = arguments.getSource().getUnsidedLevel();
                            double x = arguments.getSource().getPosition().x();
                            double y = arguments.getSource().getPosition().y();
                            double z = arguments.getSource().getPosition().z();
                            Entity entity = arguments.getSource().getEntity();
                            if (entity == null && world instanceof ServerLevel _servLevel)
                                entity = FakePlayerFactory.getMinecraft(_servLevel);
                            Direction direction = Direction.DOWN;
                            if (entity != null)
                                direction = entity.getDirection();

                            TPLocationProcedure.execute(world, arguments, entity);
                            return 0;
                        })))))
                .then(Commands.literal("Player").then(Commands.argument("Player", EntityArgument.player()).executes(arguments -> {
                    Level world = arguments.getSource().getUnsidedLevel();
                    double x = arguments.getSource().getPosition().x();
                    double y = arguments.getSource().getPosition().y();
                    double z = arguments.getSource().getPosition().z();
                    Entity entity = arguments.getSource().getEntity();
                    if (entity == null && world instanceof ServerLevel _servLevel)
                        entity = FakePlayerFactory.getMinecraft(_servLevel);
                    Direction direction = Direction.DOWN;
                    if (entity != null)
                        direction = entity.getDirection();

                    TPPlayerProcedure.execute(world, arguments, entity);
                    return 0;
                }))));
    }
}
