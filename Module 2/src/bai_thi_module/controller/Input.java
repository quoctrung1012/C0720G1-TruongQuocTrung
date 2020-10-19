package bai_thi_module.controller;

import bai_thi_module.commons.InputKeyboard;
import bai_thi_module.commons.Validate;
import bai_thi_module.models.ExtraProduct;
import bai_thi_module.models.ImportProduct;

import java.util.ArrayList;
import java.util.List;

public class Input {
    public List<ExtraProduct> extraProductList = new ArrayList<>();
    public List<ImportProduct> importProductList = new ArrayList<>();

    public int inputIdAutoExtra() {
        int idAuto;
        idAuto = 0;
        idAuto = (extraProductList.size() == 0) ? 1 : idAuto + (extraProductList.get(extraProductList.size() - 1).getId() + 1);
        return idAuto;
    }

    public int inputIdAutoImport() {
        int idAuto;
        idAuto = 0;
        idAuto = (importProductList.size() == 0) ? 1 : idAuto + (importProductList.get(importProductList.size() - 1).getId() + 1);
        return idAuto;
    }


    public String inputCodeProduct() {
        String codeProduct;
        do {
            System.out.print("Nhập Mã sản phẩm: ");
            codeProduct = InputKeyboard.inputCharacter();
        } while (!Validate.isValidRegexString(codeProduct));
        return codeProduct;
    }

    public String inputNameProduct() {
        String nameProduct;
        do {
            System.out.print("Nhập Tên nhà sản xuất sản phẩm: ");
            nameProduct = InputKeyboard.inputCharacter();
        } while (!Validate.isValidRegexString(nameProduct));
        return nameProduct.toUpperCase();
    }

    public String inputPriceProduct() {
        String priceProduct;
        System.out.print("Nhập Giá sản phẩm: ");
        priceProduct = InputKeyboard.inputCharacter();
        return priceProduct;
    }

    public String inputAmountProduct() {
        String amountProduct;
        System.out.print("Nhập Số lượng sản phẩm: ");
        amountProduct = InputKeyboard.inputCharacter();
        return amountProduct;
    }

    public String inputProducerProduct() {
        String nameProducerProduct;
        do {
            System.out.print("Nhập Tên nhà sản xuất sản phẩm: ");
            nameProducerProduct = InputKeyboard.inputCharacter();
        } while (!Validate.isValidRegexString(nameProducerProduct));
        return nameProducerProduct;
    }

    public String inputPriceImportProduct() {
        String priceImport;
        System.out.print("Nhập Giá nhập khẩu: ");
        priceImport = InputKeyboard.inputCharacter();
        return priceImport;
    }

    public String inputCityImportProduct() {
        String nameCityImport;
        do {
            System.out.print("Nhập Thành phố nhập khẩu: ");
            nameCityImport = InputKeyboard.inputCharacter();
        } while (!Validate.isValidRegexString(nameCityImport));
        return nameCityImport;
    }

    public String inputTaxImportProduct() {
        String priceTaxImport;
        System.out.print("Nhập Thuế nhập khẩu sản phẩm: ");
        priceTaxImport = InputKeyboard.inputCharacter();
        return priceTaxImport;
    }

    public String inputPriceExtraProduct() {
        String priceExtra;
        System.out.print("Nhập Giá nhập khẩu: ");
        priceExtra = InputKeyboard.inputCharacter();
        return priceExtra;
    }

    public String inputCountryImportProduct() {
        String nameCountryExtra;
        do {
            System.out.print("Nhập Thành phố nhập khẩu: ");
            nameCountryExtra = InputKeyboard.inputCharacter();
        } while (!Validate.isValidRegexString(nameCountryExtra));
        return nameCountryExtra;
    }
}
