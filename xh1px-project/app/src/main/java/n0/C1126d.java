package n0;

import android.net.Uri;
import android.os.Bundle;
import q4.X;
import s3.AbstractC1492c;

/* renamed from: n0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1126d extends AbstractC1117G {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f12748r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1126d(int i4, boolean z8) {
        super(z8);
        this.f12748r = i4;
    }

    @Override // n0.AbstractC1117G
    public final Object a(String str, Bundle bundle) {
        switch (this.f12748r) {
            case 0:
                o6.j.e(bundle, "bundle");
                if (!bundle.containsKey(str) || X.B(str, bundle)) {
                    return null;
                }
                boolean z8 = bundle.getBoolean(str, false);
                if (!z8 && bundle.getBoolean(str, true)) {
                    AbstractC1492c.z(str);
                    throw null;
                }
                return Boolean.valueOf(z8);
            case 1:
                o6.j.e(bundle, "bundle");
                float f8 = bundle.getFloat(str, Float.MIN_VALUE);
                if (f8 == Float.MIN_VALUE && bundle.getFloat(str, Float.MAX_VALUE) == Float.MAX_VALUE) {
                    AbstractC1492c.z(str);
                    throw null;
                }
                return Float.valueOf(f8);
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                o6.j.e(bundle, "bundle");
                return Integer.valueOf(X.y(str, bundle));
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                o6.j.e(bundle, "bundle");
                long j = bundle.getLong(str, Long.MIN_VALUE);
                if (j == Long.MIN_VALUE && bundle.getLong(str, Long.MAX_VALUE) == Long.MAX_VALUE) {
                    AbstractC1492c.z(str);
                    throw null;
                }
                return Long.valueOf(j);
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                o6.j.e(bundle, "bundle");
                return Integer.valueOf(X.y(str, bundle));
            default:
                o6.j.e(bundle, "bundle");
                if (!bundle.containsKey(str) || X.B(str, bundle)) {
                    return null;
                }
                String string = bundle.getString(str);
                if (string != null) {
                    return string;
                }
                AbstractC1492c.z(str);
                throw null;
        }
    }

    @Override // n0.AbstractC1117G
    public final String b() {
        switch (this.f12748r) {
            case 0:
                return "boolean";
            case 1:
                return "float";
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return "integer";
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return "long";
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                return "reference";
            default:
                return "string";
        }
    }

    @Override // n0.AbstractC1117G
    public final Object d(String str) {
        boolean z8;
        int parseInt;
        String str2;
        long parseLong;
        int parseInt2;
        switch (this.f12748r) {
            case 0:
                o6.j.e(str, "value");
                if (str.equals("true")) {
                    z8 = true;
                } else if (str.equals("false")) {
                    z8 = false;
                } else {
                    throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                }
                return Boolean.valueOf(z8);
            case 1:
                o6.j.e(str, "value");
                return Float.valueOf(Float.parseFloat(str));
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                o6.j.e(str, "value");
                if (I7.v.a0(str, "0x")) {
                    String substring = str.substring(2);
                    o6.j.d(substring, "substring(...)");
                    AbstractC1492c.f(16);
                    parseInt = Integer.parseInt(substring, 16);
                } else {
                    parseInt = Integer.parseInt(str);
                }
                return Integer.valueOf(parseInt);
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                o6.j.e(str, "value");
                if (I7.v.W(str, "L")) {
                    str2 = str.substring(0, str.length() - 1);
                    o6.j.d(str2, "substring(...)");
                } else {
                    str2 = str;
                }
                if (I7.v.a0(str, "0x")) {
                    String substring2 = str2.substring(2);
                    o6.j.d(substring2, "substring(...)");
                    AbstractC1492c.f(16);
                    parseLong = Long.parseLong(substring2, 16);
                } else {
                    parseLong = Long.parseLong(str2);
                }
                return Long.valueOf(parseLong);
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                o6.j.e(str, "value");
                if (I7.v.a0(str, "0x")) {
                    String substring3 = str.substring(2);
                    o6.j.d(substring3, "substring(...)");
                    AbstractC1492c.f(16);
                    parseInt2 = Integer.parseInt(substring3, 16);
                } else {
                    parseInt2 = Integer.parseInt(str);
                }
                return Integer.valueOf(parseInt2);
            default:
                o6.j.e(str, "value");
                if (str.equals("null")) {
                    return null;
                }
                return str;
        }
    }

    @Override // n0.AbstractC1117G
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.f12748r) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                o6.j.e(str, "key");
                bundle.putBoolean(str, booleanValue);
                return;
            case 1:
                float floatValue = ((Number) obj).floatValue();
                o6.j.e(str, "key");
                bundle.putFloat(str, floatValue);
                return;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                int intValue = ((Number) obj).intValue();
                o6.j.e(str, "key");
                bundle.putInt(str, intValue);
                return;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                long longValue = ((Number) obj).longValue();
                o6.j.e(str, "key");
                bundle.putLong(str, longValue);
                return;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                int intValue2 = ((Number) obj).intValue();
                o6.j.e(str, "key");
                bundle.putInt(str, intValue2);
                return;
            default:
                String str2 = (String) obj;
                o6.j.e(str, "key");
                if (str2 != null) {
                    bundle.putString(str, str2);
                    return;
                } else {
                    D2.f.D(str, bundle);
                    return;
                }
        }
    }

    @Override // n0.AbstractC1117G
    public String f(Object obj) {
        switch (this.f12748r) {
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                String str = (String) obj;
                if (str != null) {
                    o6.j.e(str, "s");
                    String encode = Uri.encode(str, null);
                    o6.j.d(encode, "encode(...)");
                    return encode;
                }
                return "null";
            default:
                return super.f(obj);
        }
    }
}
