package androidx.lifecycle;

import g6.C0790b;
import g6.InterfaceC0789a;
import kotlin.NoWhenBranchMatchedException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0503n {
    private static final /* synthetic */ InterfaceC0789a $ENTRIES;
    private static final /* synthetic */ EnumC0503n[] $VALUES;
    public static final C0501l Companion;
    public static final EnumC0503n ON_ANY;
    public static final EnumC0503n ON_CREATE;
    public static final EnumC0503n ON_DESTROY;
    public static final EnumC0503n ON_PAUSE;
    public static final EnumC0503n ON_RESUME;
    public static final EnumC0503n ON_START;
    public static final EnumC0503n ON_STOP;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.lifecycle.n] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, androidx.lifecycle.l] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.lifecycle.n] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.lifecycle.n] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, androidx.lifecycle.n] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, androidx.lifecycle.n] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, androidx.lifecycle.n] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, androidx.lifecycle.n] */
    static {
        ?? r02 = new Enum("ON_CREATE", 0);
        ON_CREATE = r02;
        ?? r12 = new Enum("ON_START", 1);
        ON_START = r12;
        ?? r22 = new Enum("ON_RESUME", 2);
        ON_RESUME = r22;
        ?? r32 = new Enum("ON_PAUSE", 3);
        ON_PAUSE = r32;
        ?? r42 = new Enum("ON_STOP", 4);
        ON_STOP = r42;
        ?? r52 = new Enum("ON_DESTROY", 5);
        ON_DESTROY = r52;
        ?? r62 = new Enum("ON_ANY", 6);
        ON_ANY = r62;
        EnumC0503n[] enumC0503nArr = {r02, r12, r22, r32, r42, r52, r62};
        $VALUES = enumC0503nArr;
        $ENTRIES = new C0790b(enumC0503nArr);
        Companion = new Object();
    }

    public static EnumC0503n valueOf(String str) {
        return (EnumC0503n) Enum.valueOf(EnumC0503n.class, str);
    }

    public static EnumC0503n[] values() {
        return (EnumC0503n[]) $VALUES.clone();
    }

    public final EnumC0504o a() {
        switch (AbstractC0502m.f8845a[ordinal()]) {
            case 1:
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return EnumC0504o.f8848f;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                return EnumC0504o.f8849g;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                return EnumC0504o.f8850h;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                return EnumC0504o.f8846d;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
