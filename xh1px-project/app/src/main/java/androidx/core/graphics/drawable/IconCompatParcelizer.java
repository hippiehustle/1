package androidx.core.graphics.drawable;

import L0.a;
import L0.b;
import Z.g;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        int i4 = iconCompat.f8557a;
        if (aVar.e(1)) {
            i4 = ((b) aVar).f2751e.readInt();
        }
        iconCompat.f8557a = i4;
        byte[] bArr = iconCompat.f8559c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f2751e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f8559c = bArr;
        iconCompat.f8560d = aVar.f(iconCompat.f8560d, 3);
        int i8 = iconCompat.f8561e;
        if (aVar.e(4)) {
            i8 = ((b) aVar).f2751e.readInt();
        }
        iconCompat.f8561e = i8;
        int i9 = iconCompat.f8562f;
        if (aVar.e(5)) {
            i9 = ((b) aVar).f2751e.readInt();
        }
        iconCompat.f8562f = i9;
        iconCompat.f8563g = (ColorStateList) aVar.f(iconCompat.f8563g, 6);
        String str = iconCompat.f8565i;
        if (aVar.e(7)) {
            str = ((b) aVar).f2751e.readString();
        }
        iconCompat.f8565i = str;
        String str2 = iconCompat.j;
        if (aVar.e(8)) {
            str2 = ((b) aVar).f2751e.readString();
        }
        iconCompat.j = str2;
        iconCompat.f8564h = PorterDuff.Mode.valueOf(iconCompat.f8565i);
        switch (iconCompat.f8557a) {
            case -1:
                Parcelable parcelable = iconCompat.f8560d;
                if (parcelable != null) {
                    iconCompat.f8558b = parcelable;
                    return iconCompat;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 0:
            default:
                return iconCompat;
            case 1:
            case g.STRING_FIELD_NUMBER /* 5 */:
                Parcelable parcelable2 = iconCompat.f8560d;
                if (parcelable2 != null) {
                    iconCompat.f8558b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f8559c;
                iconCompat.f8558b = bArr3;
                iconCompat.f8557a = 3;
                iconCompat.f8561e = 0;
                iconCompat.f8562f = bArr3.length;
                return iconCompat;
            case g.FLOAT_FIELD_NUMBER /* 2 */:
            case g.LONG_FIELD_NUMBER /* 4 */:
            case g.STRING_SET_FIELD_NUMBER /* 6 */:
                String str3 = new String(iconCompat.f8559c, Charset.forName("UTF-16"));
                iconCompat.f8558b = str3;
                if (iconCompat.f8557a == 2 && iconCompat.j == null) {
                    iconCompat.j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case g.INTEGER_FIELD_NUMBER /* 3 */:
                iconCompat.f8558b = iconCompat.f8559c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f8565i = iconCompat.f8564h.name();
        switch (iconCompat.f8557a) {
            case -1:
                iconCompat.f8560d = (Parcelable) iconCompat.f8558b;
                break;
            case 1:
            case g.STRING_FIELD_NUMBER /* 5 */:
                iconCompat.f8560d = (Parcelable) iconCompat.f8558b;
                break;
            case g.FLOAT_FIELD_NUMBER /* 2 */:
                iconCompat.f8559c = ((String) iconCompat.f8558b).getBytes(Charset.forName("UTF-16"));
                break;
            case g.INTEGER_FIELD_NUMBER /* 3 */:
                iconCompat.f8559c = (byte[]) iconCompat.f8558b;
                break;
            case g.LONG_FIELD_NUMBER /* 4 */:
            case g.STRING_SET_FIELD_NUMBER /* 6 */:
                iconCompat.f8559c = iconCompat.f8558b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i4 = iconCompat.f8557a;
        if (-1 != i4) {
            aVar.h(1);
            ((b) aVar).f2751e.writeInt(i4);
        }
        byte[] bArr = iconCompat.f8559c;
        if (bArr != null) {
            aVar.h(2);
            Parcel parcel = ((b) aVar).f2751e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f8560d;
        if (parcelable != null) {
            aVar.h(3);
            ((b) aVar).f2751e.writeParcelable(parcelable, 0);
        }
        int i8 = iconCompat.f8561e;
        if (i8 != 0) {
            aVar.h(4);
            ((b) aVar).f2751e.writeInt(i8);
        }
        int i9 = iconCompat.f8562f;
        if (i9 != 0) {
            aVar.h(5);
            ((b) aVar).f2751e.writeInt(i9);
        }
        ColorStateList colorStateList = iconCompat.f8563g;
        if (colorStateList != null) {
            aVar.h(6);
            ((b) aVar).f2751e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f8565i;
        if (str != null) {
            aVar.h(7);
            ((b) aVar).f2751e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            aVar.h(8);
            ((b) aVar).f2751e.writeString(str2);
        }
    }
}
