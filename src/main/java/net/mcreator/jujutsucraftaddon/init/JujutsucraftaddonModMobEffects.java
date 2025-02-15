
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jujutsucraftaddon.init;

import net.mcreator.jujutsucraftaddon.JujutsucraftaddonMod;
import net.mcreator.jujutsucraftaddon.potion.*;
import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class JujutsucraftaddonModMobEffects {
    public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, JujutsucraftaddonMod.MODID);
    public static final RegistryObject<MobEffect> FUTURE_SIGHT_EFFECT = REGISTRY.register("future_sight_effect", () -> new FutureSightEffectMobEffect());
    public static final RegistryObject<MobEffect> AWAKENING = REGISTRY.register("awakening", () -> new AwakeningMobEffect());
    public static final RegistryObject<MobEffect> MURASAKI_EFFECT = REGISTRY.register("murasaki_effect", () -> new MurasakiEffectMobEffect());
    public static final RegistryObject<MobEffect> DOMAIN_EFFECT = REGISTRY.register("domain_effect", () -> new DomainEffectMobEffect());
    public static final RegistryObject<MobEffect> DASH = REGISTRY.register("dash", () -> new DashMobEffect());
    public static final RegistryObject<MobEffect> DASH_COOLDOWN = REGISTRY.register("dash_cooldown", () -> new DashCooldownMobEffect());
    public static final RegistryObject<MobEffect> RED_EFFECT = REGISTRY.register("red_effect", () -> new RedEffectMobEffect());
    public static final RegistryObject<MobEffect> SIMPLE_DOMAIN_MAX = REGISTRY.register("simple_domain_max", () -> new SimpleDomainMaxMobEffect());
    public static final RegistryObject<MobEffect> SIZE = REGISTRY.register("size", () -> new SizeMobEffect());
    public static final RegistryObject<MobEffect> BROKEN_BRAIN = REGISTRY.register("broken_brain", () -> new BrokenBrainMobEffect());
    public static final RegistryObject<MobEffect> RAMPAGE_ZONE = REGISTRY.register("rampage_zone", () -> new RampageZoneMobEffect());
    public static final RegistryObject<MobEffect> JACKPOT = REGISTRY.register("jackpot", () -> new JackpotMobEffect());
    public static final RegistryObject<MobEffect> BINDING_VOW = REGISTRY.register("binding_vow", () -> new BindingVowMobEffect());
    public static final RegistryObject<MobEffect> BINDING_VOW_COOLDOWN = REGISTRY.register("binding_vow_cooldown", () -> new BindingVowCooldownMobEffect());
    public static final RegistryObject<MobEffect> OVERTIME = REGISTRY.register("overtime", () -> new OvertimeMobEffect());
    public static final RegistryObject<MobEffect> GOJO_RAMPAGE = REGISTRY.register("gojo_rampage", () -> new GojoRampageMobEffect());
    public static final RegistryObject<MobEffect> ITADORI_RAMPAGE = REGISTRY.register("itadori_rampage", () -> new ItadoriRampageMobEffect());
    public static final RegistryObject<MobEffect> ANIMATION_ONE = REGISTRY.register("animation_one", () -> new AnimationOneMobEffect());
    public static final RegistryObject<MobEffect> ANIMATION_TWO = REGISTRY.register("animation_two", () -> new AnimationTwoMobEffect());
    public static final RegistryObject<MobEffect> DOMAIN_EFFECT_START = REGISTRY.register("domain_effect_start", () -> new DomainEffectStartMobEffect());
    public static final RegistryObject<MobEffect> COUNTER = REGISTRY.register("counter", () -> new CounterMobEffect());
    public static final RegistryObject<MobEffect> COUNTER_CD = REGISTRY.register("counter_cd", () -> new CounterCDMobEffect());
    public static final RegistryObject<MobEffect> GOJO_IMBUED_POWER = REGISTRY.register("gojo_imbued_power", () -> new GojoImbuedPowerMobEffect());
    public static final RegistryObject<MobEffect> SUKUNA_POWERS = REGISTRY.register("sukuna_powers", () -> new SukunaPowersMobEffect());
    public static final RegistryObject<MobEffect> TOJI_EFFECT = REGISTRY.register("toji_effect", () -> new TojiEffectMobEffect());
    public static final RegistryObject<MobEffect> SHRINE_EFFECT = REGISTRY.register("shrine_effect", () -> new ShrineEffectMobEffect());
    public static final RegistryObject<MobEffect> BLUE_EFFECT = REGISTRY.register("blue_effect", () -> new BlueEffectMobEffect());
    public static final RegistryObject<MobEffect> KOKUSEN_EFFECT = REGISTRY.register("kokusen_effect", () -> new KokusenEffectMobEffect());
    public static final RegistryObject<MobEffect> KOKUSEN_EFFECT_TWO = REGISTRY.register("kokusen_effect_two", () -> new KokusenEffectTwoMobEffect());
    public static final RegistryObject<MobEffect> LIMBS_EFFECT = REGISTRY.register("limbs_effect", () -> new LimbsEffectMobEffect());
    public static final RegistryObject<MobEffect> WORLD_SLASH_EFFECT = REGISTRY.register("world_slash_effect", () -> new WorldSlashEffectMobEffect());
    public static final RegistryObject<MobEffect> ITADORI_AWAKENING = REGISTRY.register("itadori_awakening", () -> new ItadoriAwakeningMobEffect());
    public static final RegistryObject<MobEffect> SUKUNA = REGISTRY.register("sukuna", () -> new SukunaMobEffect());
    public static final RegistryObject<MobEffect> DOMAIN_BREAK = REGISTRY.register("domain_break", () -> new DomainBreakMobEffect());
    public static final RegistryObject<MobEffect> GOJO_BLUE_ANIM = REGISTRY.register("gojo_blue_anim", () -> new GojoBlueAnimMobEffect());
    public static final RegistryObject<MobEffect> HWB = REGISTRY.register("hwb", () -> new HWBMobEffect());
    public static final RegistryObject<MobEffect> BASE_POTION = REGISTRY.register("base_potion", () -> new BasePotionMobEffect());
    public static final RegistryObject<MobEffect> BLACK_HOLE = REGISTRY.register("black_hole", () -> new BlackHoleMobEffect());
    public static final RegistryObject<MobEffect> C_DTAKABA = REGISTRY.register("c_dtakaba", () -> new CDtakabaMobEffect());
    public static final RegistryObject<MobEffect> CD_TAKABA_2 = REGISTRY.register("cd_takaba_2", () -> new CdTAKABA2MobEffect());
    public static final RegistryObject<MobEffect> HEIAN = REGISTRY.register("heian", () -> new HeianMobEffect());
    public static final RegistryObject<MobEffect> RCT_CUT = REGISTRY.register("rct_cut", () -> new RCTCutMobEffect());
    public static final RegistryObject<MobEffect> COOLDOWN_TOJI = REGISTRY.register("cooldown_toji", () -> new CooldownTojiMobEffect());
    public static final RegistryObject<MobEffect> GOJO_AWAKENING = REGISTRY.register("gojo_awakening", () -> new GojoAwakeningMobEffect());
    public static final RegistryObject<MobEffect> JOGO_FLAME = REGISTRY.register("jogo_flame", () -> new JogoFlameMobEffect());
    public static final RegistryObject<MobEffect> VOW_FRIEND = REGISTRY.register("vow_friend", () -> new VowFriendMobEffect());
    public static final RegistryObject<MobEffect> COOLDOWN_ITADORI = REGISTRY.register("cooldown_itadori", () -> new CooldownItadoriMobEffect());
    public static final RegistryObject<MobEffect> SOKA_MONA = REGISTRY.register("soka_mona", () -> new SokaMonaMobEffect());
    public static final RegistryObject<MobEffect> INFINITY = REGISTRY.register("infinity", () -> new InfinityMobEffect());
    public static final RegistryObject<MobEffect> MANIFESTATION = REGISTRY.register("manifestation", () -> new ManifestationMobEffect());
    public static final RegistryObject<MobEffect> HIDING = REGISTRY.register("hiding", () -> new HidingMobEffect());
    public static final RegistryObject<MobEffect> ONE_HUNDRED_AND_TWENTY = REGISTRY.register("one_hundred_and_twenty", () -> new OneHundredAndTwentyMobEffect());
    public static final RegistryObject<MobEffect> BLACK_FLASH_CUT = REGISTRY.register("black_flash_cut", () -> new BlackFlashCutMobEffect());
    public static final RegistryObject<MobEffect> BERSERK = REGISTRY.register("berserk", () -> new BerserkMobEffect());
    public static final RegistryObject<MobEffect> DOMAIN_TIME = REGISTRY.register("domain_time", () -> new DomainTimeMobEffect());
    public static final RegistryObject<MobEffect> SOROIRO = REGISTRY.register("soroiro", () -> new SoroiroMobEffect());
    public static final RegistryObject<MobEffect> ANTI_HEAL = REGISTRY.register("anti_heal", () -> new AntiHealMobEffect());
    public static final RegistryObject<MobEffect> MEDITATION_STATE = REGISTRY.register("meditation_state", () -> new MeditationStateMobEffect());
    public static final RegistryObject<MobEffect> TRAINING = REGISTRY.register("training", () -> new TrainingMobEffect());
    public static final RegistryObject<MobEffect> HOUR_CINDERELLA = REGISTRY.register("hour_cinderella", () -> new HourCinderellaMobEffect());
    public static final RegistryObject<MobEffect> ANIM = REGISTRY.register("anim", () -> new AnimMobEffect());
    public static final RegistryObject<MobEffect> ANIM_2 = REGISTRY.register("anim_2", () -> new Anim2MobEffect());
    public static final RegistryObject<MobEffect> ANIM_3 = REGISTRY.register("anim_3", () -> new Anim3MobEffect());
    public static final RegistryObject<MobEffect> ANIM_4 = REGISTRY.register("anim_4", () -> new Anim4MobEffect());
    public static final RegistryObject<MobEffect> ANIM_1 = REGISTRY.register("anim_1", () -> new Anim1MobEffect());
    public static final RegistryObject<MobEffect> TESTING = REGISTRY.register("testing", () -> new TestingMobEffect());
    public static final RegistryObject<MobEffect> AI = REGISTRY.register("ai", () -> new AIMobEffect());
    public static final RegistryObject<MobEffect> QUAKE = REGISTRY.register("quake", () -> new QuakeMobEffect());
    public static final RegistryObject<MobEffect> AWAKE = REGISTRY.register("awake", () -> new AwakeMobEffect());
    public static final RegistryObject<MobEffect> CLONE_TICKED = REGISTRY.register("clone_ticked", () -> new CloneTickedMobEffect());
    public static final RegistryObject<MobEffect> NAOYA_AWAKENING = REGISTRY.register("naoya_awakening", () -> new NaoyaAwakeningMobEffect());
    public static final RegistryObject<MobEffect> COUNTER_ANIMATION = REGISTRY.register("counter_animation", () -> new CounterAnimationMobEffect());
    public static final RegistryObject<MobEffect> FATIGUE = REGISTRY.register("fatigue", () -> new FatigueMobEffect());
    public static final RegistryObject<MobEffect> MUSIC = REGISTRY.register("music", () -> new MusicMobEffect());
    public static final RegistryObject<MobEffect> REMOVE_OWNER = REGISTRY.register("remove_owner", () -> new RemoveOwnerMobEffect());
    public static final RegistryObject<MobEffect> SUKUNA_HEARY = REGISTRY.register("sukuna_heary", () -> new SukunaHearyMobEffect());
    public static final RegistryObject<MobEffect> SUKUNA_VC = REGISTRY.register("sukuna_vc", () -> new SukunaVCMobEffect());
    public static final RegistryObject<MobEffect> EXPIRED = REGISTRY.register("expired", () -> new ExpiredMobEffect());
    public static final RegistryObject<MobEffect> FAINTED = REGISTRY.register("fainted", () -> new FaintedMobEffect());
    public static final RegistryObject<MobEffect> CONTAINED = REGISTRY.register("contained", () -> new ContainedMobEffect());
    public static final RegistryObject<MobEffect> BERSERK_ANIM = REGISTRY.register("berserk_anim", () -> new BerserkAnimMobEffect());
    public static final RegistryObject<MobEffect> RESPAWNED = REGISTRY.register("respawned", () -> new RespawnedMobEffect());
    public static final RegistryObject<MobEffect> OUT_LINER = REGISTRY.register("out_liner", () -> new OutLinerMobEffect());
    public static final RegistryObject<MobEffect> OUTLINE_1 = REGISTRY.register("outline_1", () -> new OUTLINE1MobEffect());
    public static final RegistryObject<MobEffect> BATTLE = REGISTRY.register("battle", () -> new BattleMobEffect());
    public static final RegistryObject<MobEffect> TEAM_BATTLE = REGISTRY.register("team_battle", () -> new TeamBattleMobEffect());
    public static final RegistryObject<MobEffect> REWARD = REGISTRY.register("reward", () -> new RewardMobEffect());
    public static final RegistryObject<MobEffect> ANIMATION = REGISTRY.register("animation", () -> new AnimationMobEffect());
    public static final RegistryObject<MobEffect> TEXTURE_ANIMATOR_1 = REGISTRY.register("texture_animator_1", () -> new TextureAnimator1MobEffect());
    public static final RegistryObject<MobEffect> REGENERATE_SHIKIGAMI = REGISTRY.register("regenerate_shikigami", () -> new RegenerateShikigamiMobEffect());
    public static final RegistryObject<MobEffect> COOLDOWN_TP = REGISTRY.register("cooldown_tp", () -> new CooldownTPMobEffect());
    public static final RegistryObject<MobEffect> ATTACKED = REGISTRY.register("attacked", () -> new AttackedMobEffect());
    public static final RegistryObject<MobEffect> RESPAWNED_ONE = REGISTRY.register("respawned_one", () -> new RespawnedOneMobEffect());
    public static final RegistryObject<MobEffect> CE_FIX_POTION = REGISTRY.register("ce_fix_potion", () -> new CeFixPotionMobEffect());
    public static final RegistryObject<MobEffect> RESPAWNED_JUJUTSU = REGISTRY.register("respawned_jujutsu", () -> new RespawnedJujutsuMobEffect());
    public static final RegistryObject<MobEffect> MAHO_EFFECTO = REGISTRY.register("maho_effecto", () -> new MahoEffectoMobEffect());
    public static final RegistryObject<MobEffect> JOGO_FATIGUE = REGISTRY.register("jogo_fatigue", () -> new JogoFatigueMobEffect());
    public static final RegistryObject<MobEffect> YOROZU = REGISTRY.register("yorozu", () -> new YorozuMobEffect());
    public static final RegistryObject<MobEffect> SECOND_TECHNIQUE_EFFECT = REGISTRY.register("second_technique_effect", () -> new SecondTechniqueEffectMobEffect());
    public static final RegistryObject<MobEffect> URO_SNEAKY = REGISTRY.register("uro_sneaky", () -> new UroSneakyMobEffect());
    public static final RegistryObject<MobEffect> KOKUSEN_N = REGISTRY.register("kokusen_n", () -> new KokusenNMobEffect());
    public static final RegistryObject<MobEffect> DAMAGE = REGISTRY.register("damage", () -> new DamageMobEffect());
    public static final RegistryObject<MobEffect> HAHAHAHA = REGISTRY.register("hahahaha", () -> new HAHAHAHAMobEffect());
    public static final RegistryObject<MobEffect> SUKUNA_CUTSCENE_1 = REGISTRY.register("sukuna_cutscene_1", () -> new SukunaCutscene1MobEffect());
    public static final RegistryObject<MobEffect> SUKUNA_SOUND_1 = REGISTRY.register("sukuna_sound_1", () -> new SukunaSound1MobEffect());
    public static final RegistryObject<MobEffect> SUKUNA_AWAKEN_2 = REGISTRY.register("sukuna_awaken_2", () -> new SukunaAwaken2MobEffect());
    public static final RegistryObject<MobEffect> LA_DANSA = REGISTRY.register("la_dansa", () -> new LaDansaMobEffect());
    public static final RegistryObject<MobEffect> JUREI = REGISTRY.register("jurei", () -> new JureiMobEffect());
    public static final RegistryObject<MobEffect> DEATH_PAINTING_STACK = REGISTRY.register("death_painting_stack", () -> new DeathPaintingStackMobEffect());
    public static final RegistryObject<MobEffect> SUKUNA_CUTSCENE_3 = REGISTRY.register("sukuna_cutscene_3", () -> new SukunaCutscene3MobEffect());
    public static final RegistryObject<MobEffect> SUKUNA_SPAWNING = REGISTRY.register("sukuna_spawning", () -> new SukunaSpawningMobEffect());
    public static final RegistryObject<MobEffect> DESPAWNING = REGISTRY.register("despawning", () -> new DespawningMobEffect());
    public static final RegistryObject<MobEffect> FUGA = REGISTRY.register("fuga", () -> new FugaMobEffect());
    public static final RegistryObject<MobEffect> MALEVOLENT = REGISTRY.register("malevolent", () -> new MalevolentMobEffect());
    public static final RegistryObject<MobEffect> COMMAND = REGISTRY.register("command", () -> new CommandMobEffect());
    public static final RegistryObject<MobEffect> HEIAN_FORM = REGISTRY.register("heian_form", () -> new HeianFormMobEffect());
    public static final RegistryObject<MobEffect> ANIMATION_HEIAN = REGISTRY.register("animation_heian", () -> new AnimationHeianMobEffect());
    public static final RegistryObject<MobEffect> WORLD_CUT = REGISTRY.register("world_cut", () -> new WorldCutMobEffect());
    public static final RegistryObject<MobEffect> WORLD_HEAVY = REGISTRY.register("world_heavy", () -> new WorldHeavyMobEffect());
    public static final RegistryObject<MobEffect> WORLD_GOJO = REGISTRY.register("world_gojo", () -> new WorldGojoMobEffect());
    public static final RegistryObject<MobEffect> FATIGUE_BLACK_FLASH = REGISTRY.register("fatigue_black_flash", () -> new FatigueBlackFlashMobEffect());
    public static final RegistryObject<MobEffect> GOJO_AWAKENING_1 = REGISTRY.register("gojo_awakening_1", () -> new GojoAwakening1MobEffect());
    public static final RegistryObject<MobEffect> IMBUED_FISTS = REGISTRY.register("imbued_fists", () -> new ImbuedFistsMobEffect());
    public static final RegistryObject<MobEffect> DODGE = REGISTRY.register("dodge", () -> new DodgeMobEffect());
}
