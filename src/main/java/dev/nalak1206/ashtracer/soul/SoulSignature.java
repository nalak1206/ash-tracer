package dev.nalak1206.ashtracer.soul;

/** Server-authoritative soul state sent to clients as a compact snapshot. */
public record SoulSignature(
	SoulIntent intent,
	float intensity,
	float stability,
	long observedAtTick
) {
	public SoulSignature {
		if (intensity < 0.0F || intensity > 1.0F) {
			throw new IllegalArgumentException("intensity must be between 0 and 1");
		}
		if (stability < 0.0F || stability > 1.0F) {
			throw new IllegalArgumentException("stability must be between 0 and 1");
		}
	}
}
