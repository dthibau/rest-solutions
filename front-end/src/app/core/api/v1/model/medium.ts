/**
 * API Mediatheque
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { CD } from './cD';
import { DVD } from './dVD';
import { Book } from './book';


export interface Medium { 
    id?: number;
    titre?: string;
    dateParution?: string;
    type?: Medium.TypeEnum;
    CD?: CD;
    DVD?: DVD;
    Book?: Book;
}
export namespace Medium {
    export type TypeEnum = 'CD' | 'DVD' | 'Book';
    export const TypeEnum = {
        Cd: 'CD' as TypeEnum,
        Dvd: 'DVD' as TypeEnum,
        Book: 'Book' as TypeEnum
    };
}


